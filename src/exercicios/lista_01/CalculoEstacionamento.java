import java.util.Scanner;

public class CalculoEstacionamento {

    public static double calcularTarifa(int horas) {
        double tarifa = 5.0;

        if (horas > 2) {
            tarifa = tarifa + ((horas - 2) * 3.0);
        }

        return tarifa;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de horas de estacionamento: ");
        int horas = entrada.nextInt();

        double valor = calcularTarifa(horas);

        System.out.println("Valor a pagar: R$ " + valor);

        entrada.close();
    }
}
