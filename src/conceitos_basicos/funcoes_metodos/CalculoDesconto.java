import java.util.Scanner;

public class CalculoDesconto {

    public static double aplicarDesconto(double preco, int percentual) {
        double desconto = (preco * percentual) / 100;
        return preco - desconto;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço: ");
        double preco = entrada.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        int percentual = entrada.nextInt();

        double precoFinal = aplicarDesconto(preco, percentual);

        System.out.println("Preço final: " + precoFinal);

        entrada.close();
    }
}
