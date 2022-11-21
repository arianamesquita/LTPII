package Revisao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AulaString2 {
    public static void main(String[] args) throws FileNotFoundException {
        String a = "oi";
        String b = " Ariana";
        String c = a.concat(b);
        System.out.println(c);
        //.concat - concatena Strings

        //StringBuilder - construtores - já coloca a qtdd de caracteres q a String terá.
        //.append() -  adiciona dados no final da string inicial
        //.insert() - insere informacoes no meio da string - de acordo com a posicao
        //.delete() - deletar parte indicando os indices a cortar
        //.deleteCharAt() - deleta um caracter específico
        //.reverse - reverso
        //.setCharAt - muda o caracter de um determinado indice
        //.capacity - retorna capacidade atual da string
        //.length - retorna o tamanho atual da string builder
        //.setLength - define comprimento exato da string para novo valor
        //.charAt - retorna o caractere de um indice especifico

        //StringBuffer - usar quando for alterar coisas com frequencia - em várias threads - lenta - heap
        //StringBuilder - quando for alterar com frequencia usando uma unica thread - rapida - heap
        //String - usar qdo nao for mudar muito - String Pool

/*        StringBuffer word = null;
        word = new StringBuffer('P');
        word.append('a');
        System.out.println(word);*/

        //exercício 1 - crie um laço de repetição que imprima as letras de a a z, maiusculo ou minusculo, conforme
        //escolha do usuario

        //exercicio 2 - crie uma historia em .txt
/*        Scanner input = new Scanner(new File("src/Revisao/file.txt"));

        while(input.hasNextLine()){
            System.out.println(input.nextLine());
        }*/

        //exercicio 3 - crie um programa que leia o seguinte arquivo de texto, palavra por palavra
        //e imprima cada palavra em uma linha.
        Scanner input = new Scanner(new File("src/Revisao/file2.txt"));
        while(input.hasNext()){
            System.out.println(input.next());
        }

        //random que escolhe entre umas 50 palavras com mais de 6 caracteres
        //mostra umas tres letras e da chance pro usuario adivinhar
        //mostra qtas tentativas leva pra adivinhar


    }
/*    public static void imprimeAlfabeto(char inicio, char fim){ //exercicio 1
        for( char i = inicio; i <= fim; i++ )
        System.out.println(i);
    } */

}
