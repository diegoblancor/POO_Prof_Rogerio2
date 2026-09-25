import java.util.Scanner;

public class Autenticacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senhaCorreta = "1234";
        String senha = "";
        boolean acertou = false;

        while (!acertou) {
            System.out.print("Digite a senha: ");
            senha = entrada.nextLine();

            if (senha.equals(senhaCorreta)) {
                System.out.println("Acesso concedido!");
                acertou = true;
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        entrada.close();
    }
}
