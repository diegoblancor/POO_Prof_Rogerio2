package conceitos_basicos.classes_abstratas_interfaces;

public class Car extends Vehicle {
    private double valor;

    public Car(String placa, double valor) {
        super(placa);
        this.valor = valor;
    }

    @Override
    public double calcularIPVA() {
        return this.valor * 0.04;
    }

    public double getValor() {
        return this.valor;
    }
}