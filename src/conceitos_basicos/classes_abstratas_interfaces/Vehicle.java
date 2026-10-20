package conceitos_basicos.classes_abstratas_interfaces;

public abstract class Vehicle {
    private String placa;

    public Vehicle(String placa) {
        this.placa = placa;
    }

    public abstract double calcularIPVA();

    public String descrever() {
        return "Veiculo placa: " + this.placa;
    }

    public String getPlaca() {
        return this.placa;
    }
}