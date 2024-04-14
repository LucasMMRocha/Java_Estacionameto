package Estacionamento;

public class Caminhonete_Furgao extends Veiculo {

    public Caminhonete_Furgao(double peso, double volume, int type, int carro) {
        super(peso, volume, type, carro);
    }

    public double calcularPrecoPorHora() {
        double peso = getPeso();
        if (peso <= 3000) {
            return 25.0; // Caminhonete não carregada
        } else if (peso <= 6000) {
            return 50.0; // Caminhonete carregada
        } else {
            // Caminhonete com peso maior que 6 ton
            return 0.0; // Nao pode estacionar
        }
    }

}
