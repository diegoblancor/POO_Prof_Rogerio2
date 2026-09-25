import java.util.Scanner;

public class VerificarQuadrante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a coordenada X: ");
        int x = entrada.nextInt();

        System.out.print("Digite a coordenada Y: ");
        int y = entrada.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Primeiro quadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("Segundo quadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("Terceiro quadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("Quarto quadrante");
        } else {
            System.out.println("Está sobre um eixo");
        }

        entrada.close();
    }
}
