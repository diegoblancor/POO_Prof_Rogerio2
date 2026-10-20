package conceitos_basicos.classes_abstratas_interfaces;

public abstract class Veiculo {
    private String placa;
    private double valorDiaria;

    public Veiculo(String placa, double valorDiaria) {
        this.placa = placa;
        this.valorDiaria = valorDiaria;
    }

    public String getPlaca() {
        return this.placa;
    }

    public double getValorDiaria() {
        return this.valorDiaria;
    }

    public String descrever() {
        return "Veiculo placa: " + this.placa + " | Diaria: R$ " + this.valorDiaria;
    }
}