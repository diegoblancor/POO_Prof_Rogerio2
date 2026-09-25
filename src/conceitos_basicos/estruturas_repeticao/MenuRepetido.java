import java.util.Scanner;

public class MenuRepetido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Saudação");
            System.out.println("2 - Data");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Olá! Bem-vindo!");
                    break;
                case 2:
                    System.out.println("Hoje é " + java.time.LocalDate.now());
                    break;
                case 3:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        entrada.close();
    }
}
