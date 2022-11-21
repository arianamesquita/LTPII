package Lista01;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// criar random baseado em 1, 2 e 3
// switch case escolhe o método baseado no random - 1 linha, 2 coluna, 3 diagonal principal e 4 diagonal secundária
// casa escolhida matriz impressa fica igual casa da matriz jogo

// fazer um random que seleciona o i e j para locar o navio

public class BatalhaNaval {
    public static final int BOARD_SIZE = 5;
    public static final int BOAT_SIZE = 3;
    public static final int QTTD_BOAT = 3;
    public static char[][] board;
    public static int[][] backBoard;

    public static void main(String[] args) {
        imprimeTabuleiroString(matrizJogo());
        System.out.println(" ");
        tabuleiroJogo();
        rodaJogo(backBoard, board);

    }

    public static char[][] matrizJogo() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            Arrays.fill(board[i], '-');
        }
        return board;
    }

    static void imprimeTabuleiroString(char[][] n) {
        for (int o = 0; o < BOARD_SIZE; o++) {
            System.out.print(o + " |  ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print("\t" + n[o][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print("  |   " + i + "  ");
        }
    }
/*    static void imprimeTabuleiroInt(int[][] n) {
        for (int o = 0; o < BOARD_SIZE; o++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print("\t" + n[o][j] + "\t");
            }
            System.out.println("\n");
        }
    }*/

    public static int[][] tabuleiroJogo() {
        backBoard = new int[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                backBoard[i][j] = 0;
            }
        }
        while (confereQtddNavios()) {
            escolheLocalBarco(backBoard);
            ocupaColuna(backBoard);
            ocupaLinha(backBoard);
            ocupaTransversal(backBoard);
        }
        return backBoard;
    }

    static void escolheLocalBarco(int[][] n) {
        Random rd = new Random();
        int a, b;

        int z = rd.nextInt(1, 4);
        if (z == 1) {
            a = rd.nextInt(0, 5);
            b = rd.nextInt(0, 3);
            if (n[a][b] == 0 && n[a][b + 1] == 0 && n[a][b + 2] == 0) {
                n[a][b] = z;
            } else {
                n[a][b] = n[a][b];
            }
        } else if (z == 2) {
            a = rd.nextInt(0, 3);
            b = rd.nextInt(0, 5);
            if (n[a][b] == 0 && n[a + 1][b] == 0 && n[a + 2][b] == 0) {
                n[a][b] = z;
            } else {
                n[a][b] = n[a][b];
            }
        } else if (z == 3) {
            a = rd.nextInt(0, 3);
            b = rd.nextInt(0, 3);
            if (n[a][b] == 0 && n[a + 1][b + 1] == 0 && n[a + 2][b + 2] == 0) {
                n[a][b] = z;
            } else {
                n[a][b] = n[a][b];
            }
        }
    }

    static void ocupaLinha(int[][] n) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (n[i][j] == 1 && n[i][j + 1] == 0 && n[i][j + 2] == 0) {
                    n[i][j + 1] = -1;
                    n[i][j + 2] = -1;
                }
            }
        }
    }

    static void ocupaColuna(int[][] n) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (n[i][j] == 2 && n[i + 1][j] == 0 && n[i + 2][j] == 0) {
                    n[i + 1][j] = -1;
                    n[i + 2][j] = -1;
                }
            }
        }
    }

    static void ocupaTransversal(int[][] n) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (n[i][j] == 3 && n[i + 1][j + 1] == 0 && n[i + 2][j + 2] == 0) {
                    n[i + 1][j + 1] = -1;
                    n[i + 2][j + 2] = -1;
                }
            }
        }
    }

    public static boolean confereQtddNavios() {
        int count = 0;
        boolean b = true;
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (backBoard[i][j] != 0) {
                    count++;
                }
            }
        }
        if (count == QTTD_BOAT * BOAT_SIZE) {
            b = false;
        }
        return b;
    }

    static void rodaJogo(int[][] n, char[][] j) {
        Scanner ler = new Scanner(System.in);
        String jogador1;
        int linha, coluna, count = 0, boatHit = 0;

        System.out.println("Vamos começar o jogo! Jogador, entre com seu nome.");
        jogador1 = ler.next();

        do {
            System.out.printf("\n" + "%s, escolha a linha e a coluna.", jogador1);
            System.out.println("\n");
            linha = ler.nextInt();
            coluna = ler.nextInt();
            if (n[linha][coluna] == 1 || n[linha][coluna] == 2 || n[linha][coluna] == 3 || n[linha][coluna] == -1) {
                j[linha][coluna] = '*';
                System.out.println("Embarcação atingida!");
                boatHit++;
            } else {
                j[linha][coluna] = '~';
                System.out.println("Você errou!");
            }
            count++;
            System.out.printf("Rodada %s finalizada.", count);
            System.out.println("\n");
            imprimeTabuleiroString(board);
            if (boatHit == 9){
                System.out.println("Jogo finalizado! Você encontrou todos os barcos! Parabéns!");
                break;
            }
        } while (count < BOARD_SIZE * BOARD_SIZE);
    }
}