import java.util.Scanner;

public class Quadrantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a coordenada X: ");
        int x = entrada.nextInt();

        System.out.print("Digite a coordenada Y: ");
        int y = entrada.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("O ponto está no primeiro quadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("O ponto está no segundo quadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("O ponto está no terceiro quadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("O ponto está no quarto quadrante");
        } else {
            System.out.println("O ponto está sobre um eixo");
        }

        entrada.close();
    }
}
