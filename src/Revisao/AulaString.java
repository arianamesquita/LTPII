package Revisao;

import java.util.Scanner;

public class AulaString {

    public static String nomePai1;
    public static String nomePai2;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
/*        String book = "Building Java Programs";
        String palavra = "Java";
        int i = book.indexOf(palavra);
        System.out.println(book.substring(i, i+palavra.length()));

        System.out.println(" ");

        String s = "Adele";
        s = s.toUpperCase();
        System.out.println(s);
        System.out.println(" ");*/

        //Exercício - escreva um programa que leia o primeiro nome de duas pessoas e sugira um nome para o filho
        //Pai 1 primeiro nome? Danielle
        //Pai 2 segundo nome? John
        //Child Gender? f
        //Suggested baby name: JODANI
/*        System.out.println("Entre o nome do primeiro pai:");
        nomePai1 = nomePai();
        System.out.println("Entre o nome do segundo pai:");
        nomePai2 = nomePai();
        System.out.println("Nome sugerido para o filho:");
        System.out.println(metadeNome(nomePai1).toUpperCase() + finalNome(nomePai2).toUpperCase());
        System.out.println("O segundo nome é o da mãe? Se sim, digite S. Se não, digite N.");
        if (nomeFinal()){
            System.out.println("Nome sugerido para sexo feminino ou gênero neutro.");
        } else {
            System.out.println("Nome sugerido para sexo masculino ou gênero neutro.");
        }

        System.out.println(" ");*/

        //Exercício2 - solicitar ao usuario o nome completo
        //Desenhe o padrao da esquerda
        //Isso deve ser redimensionável. O tamanho 1 é mostrado e o tamanho 2 teria o primeiro nome duas vezes
        //seguido pelo sobrenome duas vezes
        String x;
        x = nomeCompleto();
        nome(x);
        sobrenome(x);


    }
/*    public static String nomePai(){
        String nome1;
        nome1 = String.valueOf(scan.next());
        return nome1;
    }
    public static String metadeNome(String x){
        x = x.substring(0,3);
        return x;
    }
    public static String finalNome(String x){
        x = x.substring(2);
        return x;
    }
    public static boolean nomeFinal(){
        String sim;
        sim = String.valueOf(scan.next());
        if (sim.equals("S")){
            return true;
        }
        else return false;
    }*/
    public static String nomeCompleto(){
        String nome;
        nome = scan.nextLine();
        return nome;
    }
    public static void nome(String x){
        String nome;
        int j;
        j = x.indexOf(" ");
        nome = x.substring(0,j);
        movimenta(nome);
    }
    public static void sobrenome(String x){
        String sobrenome;
        int j;
        j = x.indexOf(" ");
        sobrenome = x.substring(j+1);
        movimenta(sobrenome);
    }
    public static void movimenta (String x){
        for (int i = 0; i < x.length(); i++) {
            System.out.println(x.substring(0, x.length() - i));
        }
        for (int i = 1; i < x.length()+1; i++) {
            System.out.println(x.substring(0, i));
        }
    }
}
