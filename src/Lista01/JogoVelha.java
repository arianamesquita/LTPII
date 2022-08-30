package Lista01;

// versão 2.0 utilizando métodos e armazenamento de memória
public class JogoVelha {
    public static void main(String[] args) {
        String[][] tabuleiro = tabuleiroPadrao();

    imprimeTabuleiro(tabuleiro);

    }
    public static String[][] tabuleiroPadrao() {
        String[][] jogoVelha = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogoVelha[i][j] = " ";
            }
        }
        return jogoVelha;
    }
    static void imprimeTabuleiro (String[][] n){
        System.out.println("\n------------------");
        for (int o = 0; o < 3; o++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + n[o][j] + "  |");
            }
            System.out.println("\n------------------");
        }
    }
}
