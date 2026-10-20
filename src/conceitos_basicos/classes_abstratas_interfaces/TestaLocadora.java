package conceitos_basicos.classes_abstratas_interfaces;

public class TestaLocadora {
    public static void main(String[] args) {
        int diasAluguel = 5;

        Carro carro = new Carro("ABC-1234", 120.0, 4);
        Moto moto = new Moto("XYZ-9876", 60.0, 250);
        Caminhao caminhao = new Caminhao("KKL-5555", 300.0, 10.0);

        System.out.println(carro.descrever());
        System.out.println("Aluguel do Carro por " + diasAluguel + " dias: R$ " + carro.calcularAluguel(diasAluguel));

        System.out.println("----------------------------------------");

        System.out.println(moto.descrever());
        System.out.println("Aluguel da Moto por " + diasAluguel + " dias (com desconto): R$ " + moto.calcularAluguel(diasAluguel));

        System.out.println("----------------------------------------");

        System.out.println(caminhao.descrever());
        System.out.println("Aluguel do Caminhao por " + diasAluguel + " dias (+ taxa de carga): R$ " + caminhao.calcularAluguel(diasAluguel));
    }
}