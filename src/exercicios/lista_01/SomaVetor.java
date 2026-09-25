import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
            soma = soma + numeros[i];
        }

        System.out.println("Soma dos números: " + soma);

        entrada.close();
    }
}
