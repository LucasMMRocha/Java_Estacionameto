package Estacionamento;

public class Veiculo {
    private double peso;
    private double volume;
    private int type;
    private int carro;

    public Veiculo(double peso, double volume, int type, int carro) {
        this.type = type;
        this.peso = peso;
        this.volume = volume;
        this.carro = carro;
    }

    public double getPeso() {
        return peso;
    }

    public double getVolume() {
        return volume;
    }

    public int getType() {
        return type;
    }

    public int getCarro() {
        return carro;
    }

    public double calcularPrecoPorHora() {
        // Este método será sobrescrito nas subclasses
        return 0.0; // Retornamos 0.0 como valor padrão para a classe base
    }
}
