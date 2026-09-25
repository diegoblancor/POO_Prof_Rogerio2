import java.util.Scanner;

public class SomaSequencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Até qual número você quer somar? ");
        int n = entrada.nextInt();

        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma = soma + i;
        }

        System.out.println("A soma de 1 a " + n + " é: " + soma);

        entrada.close();
    }
}
