package conceitos_basicos.classes_abstratas_interfaces;

public class Moto extends Veiculo implements Alugavel {
    private int cilindradas;

    public Moto(String placa, double valorDiaria, int cilindradas) {
        super(placa, valorDiaria);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularAluguel(int dias) {
        // Dá 5% de desconto no aluguel de motos
        double valorTotal = getValorDiaria() * dias;
        return valorTotal * 0.95;
    }
}