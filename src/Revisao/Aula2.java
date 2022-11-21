package Revisao;

import java.util.Scanner;

public class Aula2 {
    // ATRIBUTOS -> características, variáveis...
    static String mensagemDaClasse = "Essa string foi criada como um atributo da classe";
    // sem o static não funciona

    public static void main(String[] args) {
        // variáveis do tipo primitivo
         // int, char, short, boolean, double, float
        // O que não é primitivo é OBJETO!
        // CLASSES = MODELOS, MOLDE, FORMA...
        // OBJETO = AQUILO QUE É MOLDADO


        System.out.println(mensagemDaClasse);

        double x = 2;
        System.out.println(Math.pow(x, 2));
        Math.sqrt(x);

        Scanner ler = new Scanner(System.in);
        imprimeMensagem();

        int [] array = new int[2];
        // array.length;

        Aula2 novaVariavel = new Aula2();
        System.out.println(novaVariavel.imprimeMensagem2());



    }
    public static void imprimeMensagem(){
        System.out.println("Oiiii!!");
    }
    public String imprimeMensagem2(){
        System.out.println("Tchau!!");
        return null;
    }
}
