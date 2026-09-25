import java.util.Scanner;

public class Fatorial {

    public static int calcularFatorial(int n) {
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        int resultado = calcularFatorial(numero);

        System.out.println("Fatorial de " + numero + " é: " + resultado);

        entrada.close();
    }
}
