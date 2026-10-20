package conceitos_basicos.classes_abstratas_interfaces;

public class TestaVehicles {
    public static void main(String[] args) {
        Carro carro = new Carro("ABC-1234", 50000.0);
        Moto moto = new Moto("XYZ-9876", 300);
        Caminhao caminhao = new Caminhao("KKL-5555");

        System.out.println(carro.descrever());
        System.out.println("IPVA Carro: " + carro.calcularIPVA());

        System.out.println("----------------");

        System.out.println(moto.descrever());
        System.out.println("IPVA Moto: " + moto.calcularIPVA());

        System.out.println("----------------");

        System.out.println(caminhao.descrever());
        System.out.println("IPVA Caminhão: " + caminhao.calcularIPVA());
        System.out.println("Tributo Caminhão: " + caminhao.calcularTributo());
    }
}