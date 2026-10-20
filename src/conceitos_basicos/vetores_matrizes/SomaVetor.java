import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("ABC-1234", 50000.0);
        Moto minhaMoto = new Moto("XYZ-9876", 300);
        Caminhao meuCaminhao = new Caminhao("KKL-5555");

        System.out.println(meuCarro.descrever());
        System.out.println("IPVA do Carro: " + meuCarro.calcularIPVA());

        System.out.println("----------------");

        System.out.println(minhaMoto.descrever());
        System.out.println("IPVA da Moto: " + minhaMoto.calcularIPVA());

        System.out.println("----------------");

        System.out.println(meuCaminhao.descrever());
        System.out.println("IPVA do Caminhão: " + meuCaminhao.calcularIPVA());
        System.out.println("Tributo do Caminhão: " + meuCaminhao.calcularTributo());
    }
}
