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

        System.out.println(Arrays.toString(inicializarNotas()));

        maiorNota();

        menorNota();

        mediaNotas();

        quantidadeNotasAbaixoMedia();

        somar1Ponto();

    }


    public static double[] inicializarNotas(){
        double [] notas = new double[]{3.5, 9.2, 5.5, 10.0, 6.1, 6.6, 8.2, 9.5, 5.0, 7.0};
        Arrays.sort(notas);
        return notas;
    }

    static void imprimeNotas(){
        inicializarNotas();
        System.out.println(Arrays.toString(inicializarNotas()));
    }

    static void menorNota(){
        double [] notas2 = inicializarNotas();
        System.out.println("A menor nota é: " + notas2[0]);
    }

    static void maiorNota(){
        double [] notas2 = inicializarNotas();
        System.out.println("A maior nota é: " + notas2[notas2.length-1]);
    }

    public static float mediaNotas(){
        double [] notas2 = inicializarNotas();
        float media = 0;
        for (int j = 0; j < notas2.length; j++){
            media += notas2[j];
        }
        media /= notas2.length;
        imprimeNotas();
        System.out.printf("A média da sala é de %.2f. ", media);
        return media;
    }

    static void quantidadeNotasAbaixoMedia(){
        double [] notas2 = inicializarNotas();
        int qtdNotasAbaixoMedia = 0;
        float media = 6;
        for (int a = 0; a < notas2.length; a++){
            if (notas2[a] < media){
                qtdNotasAbaixoMedia++;
            }
        }
        imprimeNotas();
        System.out.printf("A quantidade de alunos com notas abaixo da média de 6.0 é de: %s. "
                , qtdNotasAbaixoMedia);
    }

    static void somar1Ponto(){
        double [] notas2 = inicializarNotas();
        for (int b = 0; b < notas2.length; b++){
            notas2[b] += 1;
            if (notas2[b] > 10){
                notas2[b] = 10.0;
            }
        }
        System.out.println(" ");
        imprimeNotas();
        System.out.println("As notas ajustadas com 1 ponto a mais:");
        System.out.println(Arrays.toString(notas2));
    }
}
