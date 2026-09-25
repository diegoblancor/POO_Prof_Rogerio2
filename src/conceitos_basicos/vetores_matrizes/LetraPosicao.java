import java.util.Scanner;

public class LetraPosicao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = entrada.nextLine();

        System.out.print("Digite a posição (começando em 0): ");
        int posicao = entrada.nextInt();

        if (posicao >= 0 && posicao < palavra.length()) {
            char letra = palavra.charAt(posicao);
            System.out.println("A letra na posição " + posicao + " é: " + letra);
        } else {
            System.out.println("Posição inválida!");
        }

        entrada.close();
    }
}
