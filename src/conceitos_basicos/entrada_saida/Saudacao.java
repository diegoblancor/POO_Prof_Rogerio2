import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = entrada.nextLine();

        System.out.println("Olá " + nome + "! Bem-vindo ao curso de Java!");

        entrada.close();
    }
}
