import java.util.Scanner;

public class Tarifas {

    public static double calcularTarifa(int tempo) {
        double tarifa = 5.0;

        if (tempo > 30) {
            tarifa = tarifa + ((tempo - 30) * 0.10);
        }

        return tarifa;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tempo de uso em minutos: ");
        int tempo = entrada.nextInt();

        double valor = calcularTarifa(tempo);

        System.out.println("Valor da tarifa: R$ " + valor);

        entrada.close();
    }
}
