import java.util.Scanner;

public class ContarVogais {

    public static int contarVogais(String texto) {
        int total = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (vogais.contains(String.valueOf(letra))) {
                total = total + 1;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = entrada.nextLine();

        int totalVogais = contarVogais(texto);

        System.out.println("Total de vogais: " + totalVogais);

        entrada.close();
    }
}
