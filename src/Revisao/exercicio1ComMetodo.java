package Revisao;

import java.util.Arrays;

public class exercicio1ComMetodo {
    // M�todo:
    // m�todo para inicializar as notas
    // verificar a maior nota
    // verificar a menor nota
    // contar quantas notas est�o abaixo da m�dia
    // m�todo para somar 1 ponto
    // m�doto para imprimir as notas
    public static void main(String[] args) {

        System.out.println(Arrays.toString(inicializarNotas()));

        maiorNota();

        menorNota();

        System.out.printf("A m�dia da sala � de %.2f. ", mediaNotas());
        System.out.println(" ");

        System.out.printf("A quantidade de alunos com notas abaixo da m�dia � de: %s. "
                , quantidadeNotasAbaixoMedia());
        System.out.println(" ");

        System.out.println("As notas ajustadas com 1 ponto a mais:");
        System.out.println(Arrays.toString(somar1Ponto()));

    }


    public static double[] inicializarNotas(){
        double [] notas = new double[]{3.5, 9.2, 5.5, 10.0, 6.1, 6.6, 8.2, 9.5, 5.0, 7.0};
        Arrays.sort(notas);
        return notas;
    }

    static void menorNota(){
        double [] notas2 = inicializarNotas();
        System.out.println("A menor nota �: " + notas2[0]);
    }

    static void maiorNota(){
        double [] notas2 = inicializarNotas();
        System.out.println("A maior nota �: " + notas2[notas2.length-1]);
    }

    public static float mediaNotas(){
        double [] notas2 = inicializarNotas();
        float media = 0;
        for (int j = 0; j < notas2.length; j++){
            media += notas2[j];
        }
        media /= notas2.length;
        return media;
    }

    public static int quantidadeNotasAbaixoMedia(){
        double [] notas2 = inicializarNotas();
        int qtdNotasAbaixoMedia = 0;
        float media = mediaNotas();
        for (int a = 0; a < notas2.length; a++){
            if (notas2[a] < media){
                qtdNotasAbaixoMedia++;
            }
        }
        return qtdNotasAbaixoMedia;
    }

    public static double[] somar1Ponto(){
        double [] notas2 = inicializarNotas();
        for (int b = 0; b < notas2.length; b++){
            notas2[b] += 1;
            if (notas2[b] > 10){
                notas2[b] = 10.0;
            }
        }
        return notas2;
    }
}