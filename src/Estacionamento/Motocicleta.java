package Estacionamento;

public class Motocicleta extends Veiculo {
    public Motocicleta(double peso, double volume, int type, int carro) {
        super(peso, volume, type, carro);
    }

    public double calcularPrecoPorHora() {
        double peso = getPeso();
        int type = getType();
        if (peso <= 100) {
            return 2.0; // Motocicleta leve
        } else if (peso <= 299.9) {
            return 4.0; // Motocicleta "padrão"
        } else {
            return 10.0; // Motocicleta pesada
        }
    }

}
