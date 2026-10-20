package conceitos_basicos.classes_abstratas_interfaces;

public class Motorcycle extends Veiculo {
    private int cilindradas;

    public Motorcycle(String placa, int cilindradas) {
        super(placa);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularIPVA() {
        if (this.cilindradas > 250) {
            return 200.0;
        } else {
            return 100.0;
        }
    }

    public int getCilindradas() {
        return this.cilindradas;
    }
}