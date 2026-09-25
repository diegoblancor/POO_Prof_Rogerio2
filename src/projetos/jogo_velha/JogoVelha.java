import java.util.Scanner;

public class JogoVelha {

    static char[][] tabuleiro = new char[3][3];
    static char jogadorAtual = 'X';

    static void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    static void exibirTabuleiro() {
        System.out.println("\n  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
            if (i < 2) {
                System.out.print("\n--|---|--\n");
            }
        }
        System.out.println("\n");
    }

    static boolean fazerJogada(int linha, int coluna) {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            return false;
        }

        if (tabuleiro[linha][coluna] != ' ') {
            return false;
        }

        tabuleiro[linha][coluna] = jogadorAtual;
        return true;
    }

    static boolean verificarVitoria() {
        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                return true;
            }
        }

        // Verificar colunas
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == jogadorAtual && tabuleiro[1][j] == jogadorAtual && tabuleiro[2][j] == jogadorAtual) {
                return true;
            }
        }

        // Verificar diagonais
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
            return true;
        }

        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
            return true;
        }

        return false;
    }

    static boolean tabuleiroCompleto() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        inicializarTabuleiro();
        boolean jogoAtivo = true;

        System.out.println("===== JOGO DA VELHA =====");
        System.out.println("Jogador 1 (X) vs Jogador 2 (O)");

        while (jogoAtivo) {
            exibirTabuleiro();

            System.out.println("Jogador " + (jogadorAtual == 'X' ? "1 (X)" : "2 (O)") + " - Sua vez!");

            System.out.print("Digite a linha (0-2): ");
            int linha = entrada.nextInt();

            System.out.print("Digite a coluna (0-2): ");
            int coluna = entrada.nextInt();

            if (!fazerJogada(linha, coluna)) {
                System.out.println("Jogada inválida!");
                continue;
            }

            if (verificarVitoria()) {
                exibirTabuleiro();
                System.out.println("Jogador " + (jogadorAtual == 'X' ? "1 (X)" : "2 (O)") + " venceu!");
                jogoAtivo = false;
            } else if (tabuleiroCompleto()) {
                exibirTabuleiro();
                System.out.println("Empate!");
                jogoAtivo = false;
            } else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }

        entrada.close();
    }
}
