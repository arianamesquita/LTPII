package Revisao;

import java.util.Arrays;

public class exercicio1ComMetodo {
    // Método:
    // método para inicializar as notas
    // verificar a maior nota
    // verificar a menor nota
    // contar quantas notas estão abaixo da média
    // método para somar 1 ponto
    // médoto para imprimir as notas
    public static void main(String[] args) {
        double[] a = inicializarNotas();

        imprimeNotas(a);

        maiorNota(a);

        menorNota(a);

        mediaNotas(a);
        System.out.println(" ");

        quantidadeNotasAbaixoMedia(a);
        System.out.println(" ");

        somar1Ponto(a);

        imprimeNotas(a);
    }

    public static double[] inicializarNotas(){
        double [] notas = new double[]{3.5, 9.2, 5.5, 10.0, 6.1, 6.6, 8.2, 9.5, 5.0, 7.0};
        Arrays.sort(notas);
        return notas;
    }

    static void imprimeNotas(double[] x){
        System.out.println(Arrays.toString(x));
    }

    static void menorNota(double[] x){
        System.out.println("A menor nota é: " + x[0]);
    }

    static void maiorNota(double[] x){
        System.out.println("A maior nota é: " + x[x.length-1]);
    }

    static void mediaNotas(double[] x){
        float media = 0;
        for (int j = 0; j < x.length; j++){
            media += x[j];
        }
        media /= x.length;
        System.out.printf("A média da sala é de %.2f. ", media);
    }

    static void quantidadeNotasAbaixoMedia(double[] x){
        int qtdNotasAbaixoMedia = 0;
        float media = 6;
        for (int a = 0; a < x.length; a++){
            if (x[a] < media){
                qtdNotasAbaixoMedia++;
            }
        }
        System.out.printf("A quantidade de alunos com notas abaixo da média de 6.0 é de: %s. "
                , qtdNotasAbaixoMedia);
    }

    static void somar1Ponto(double[] x){
        for (int b = 0; b < x.length; b++){
            x[b] += 1;
            if (x[b] > 10){
                x[b] = 10.0;
            }
        }
        System.out.println("As notas ajustadas com 1 ponto a mais:");
    }
}
