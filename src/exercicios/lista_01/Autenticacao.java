import java.util.Scanner;

public class Autenticacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senhaCorreta = "senha123";
        String senha = "";

        do {
            System.out.print("Digite a senha: ");
            senha = entrada.nextLine();

            if (!senha.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senha.equals(senhaCorreta));

        System.out.println("Autenticação bem-sucedida!");

        entrada.close();
    }
}
