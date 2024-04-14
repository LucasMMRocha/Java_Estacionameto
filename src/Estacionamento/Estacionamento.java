package Estacionamento;

import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop principal do programa
        while (true) {
            System.out.println("Digite as informações do veículo (peso em kg e volume em m3), ou digite '-1' para encerrar:");
            System.out.println("Tipo do veiculo: 1 - Moto // 2 - Carro de passeio // 3 - Caminhonete ou Furgao -> ");
            int type = scanner.nextInt();
            System.out.println("Qual tipo o seu carro de passeio: 1 - Hatchback // 2 - Sedan // 3 - SUV // -1 - Meu veiculo nao e um carro -> ");
            int carro = scanner.nextInt();
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();
            if (peso == -1) { // Permitir a saída do loop de forma mais fácil
                break;
            }

            System.out.print("Volume: ");
            double volume = scanner.nextDouble();

            // Criar o veículo com base nas informações fornecidas pelo usuário
            Veiculo veiculo = criarVeiculo(peso, volume, type, carro);

            if (veiculo != null) {
                double precoPorHora = veiculo.calcularPrecoPorHora();
                System.out.println("O preço por hora estacionada para este veículo é: R$ " + precoPorHora);
            } else {
                System.out.println("Este tipo de veículo não é permitido no estacionamento.");
            }
        }

        scanner.close();
    }

    private static Veiculo criarVeiculo(double peso, double volume, int type, int carro) {
        Veiculo veiculo = null;

        // Verificar se o veículo é uma motocicleta
        if (peso <= 300 && volume == 0 && type == 1) {
            veiculo = new Motocicleta(peso, volume, type, carro);
        }
        // Verificar se o veículo é um carro de passeio
        else if (peso > 300 && peso <= 2000 && volume <= 18 && type == 2) {
            veiculo = new CarroPasseio(peso, volume, type, carro);
        }
        // Verificar se o veículo é uma caminhonete/furgao
        else if (peso > 2000 && peso <= 6000 && volume <= 18 && type == 3) {
            veiculo = new Caminhonete_Furgao(peso, volume, type, carro);
        }

        return veiculo;
    }


}
