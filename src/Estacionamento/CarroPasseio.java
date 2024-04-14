package Estacionamento;

public class CarroPasseio extends Veiculo {
    public CarroPasseio(double peso, double volume, int type, int carro) {
        super(peso, volume, type, carro);
    }

    private double calcularPrecoPorHoraFurgao() {
        double peso = getPeso();
        double volume = getVolume();
        int carro = getCarro();

        if (peso <= 3000 && volume <= 18) {
            return 25.0; // Furgão não carregado
        } else if (peso <= 6000 && volume <= 18) {
            return 50.0; // Furgão carregado
        } else {
            // Furgão com volume maior que 18 m3
            return 0.0; // Nao pode estacionar
        }
    }

    public double calcularPrecoPorHora() {
        double peso = getPeso();
        int carro = getCarro();
        if (peso <= 2000 && carro == 1) {
            return 13.0; // Carro de passeio hatchback
        }
        else if (peso <= 2000 && carro == 2) {
            return 15.0; // Carro de passeio sedan
        }
        else if (peso <= 2000 && carro == 3) {
            return 20.0; // Carro de passeio sedan ou SUV
        } else {
            // O carro é classificado como furgão
            return calcularPrecoPorHoraFurgao();
        }
    }

}
