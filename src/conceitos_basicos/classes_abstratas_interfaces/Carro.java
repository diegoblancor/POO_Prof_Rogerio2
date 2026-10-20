package conceitos_basicos.classes_abstratas_interfaces;

public class Carro extends Veiculo implements Alugavel {
    private int quantidadePortas;

    public Carro(String placa, double valorDiaria, int quantidadePortas) {
        super(placa, valorDiaria);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public double calcularAluguel(int dias) {
        // Valor base das diárias
        return getValorDiaria() * dias;
    }
}