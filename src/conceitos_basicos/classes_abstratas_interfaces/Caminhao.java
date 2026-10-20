package conceitos_basicos.classes_abstratas_interfaces;

public class Caminhao extends Veiculo implements Alugavel {
    private double capacidadeCargaToneladas;

    public Caminhao(String placa, double valorDiaria, double capacidadeCargaToneladas) {
        super(placa, valorDiaria);
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }

    @Override
    public double calcularAluguel(int dias) {
        // Taxa adicional fixa de R$ 100 pelo uso de carga
        return (getValorDiaria() * dias) + 100.0;
    }
}