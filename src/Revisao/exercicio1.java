package Revisao;

import java.util.Arrays;

public class exercicio1 {
    public static void main(String[] args) {
        double [] notas = new double[]{3.5, 9.2, 5.5, 10.0, 6.1, 6.6, 8.2, 9.5, 5.0, 7.0};


/*        double maior = notas[0], menor = notas[0];
        for(int i = 0; i < notas.length; i++){
            if (notas[i] > maior){
                maior = notas[i];
            }
            if (notas[i] < menor){
                menor = notas[i];
            }
        }*/
        Arrays.sort(notas);
        System.out.println(Arrays.toString(notas));
        System.out.println("A maior nota é: " + notas[0] + " e a menor nota é: " + notas[notas.length-1]);

        float media = 0;
        for (int j = 0; j < notas.length; j++){
            media += notas[j];
        }
        media /= notas.length;
        System.out.printf("A nota média é %.2f.", media);
        System.out.println("");

        int qtdNotasAbaixoMedia = 0;
        System.out.println("A quantidade de notas abaixo da média: ");
        for (int a = 0; a < notas.length; a++){
            if (notas[a] < media){
                qtdNotasAbaixoMedia++;
            }
        }
        System.out.println(qtdNotasAbaixoMedia);

        for (int b = 0; b < notas.length; b++){
            notas[b] += 1;
            if (notas[b] > 10){
                notas[b] = 10.0;
            }
        }
        System.out.println(Arrays.toString(notas));
    }
    // Método:
        // método para inicializar as notas
        // verificar a maior nota
        // verificar a menor nota
        // contar quantas notas estão abaixo da média
        // método para somar 1 ponto
        // médoto para imprimir as notas
}
