package conceitos_basicos.classes_abstratas_interfaces;

public class Truck extends Veiculo implements Tributavel {

    public Truck(String placa) {
        super(placa);
    }

    @Override
    public double calcularIPVA() {
        return 500.0;
    }

    @Override
    public double calcularTributo() {
        return 150.0;
    }
}