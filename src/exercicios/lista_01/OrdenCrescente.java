import java.util.Scanner;

public class OrdenCrescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        boolean estaEmOrdem = true;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                estaEmOrdem = false;
                break;
            }
        }

        if (estaEmOrdem) {
            System.out.println("O vetor está em ordem crescente");
        } else {
            System.out.println("O vetor NÃO está em ordem crescente");
        }

        entrada.close();
    }
}
