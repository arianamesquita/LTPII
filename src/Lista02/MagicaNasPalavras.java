package Lista02;

import java.util.Random;
import java.util.Scanner;

public class MagicaNasPalavras {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        System.out.println("Entre o nome: ");
        String enter;
        enter = scan.nextLine();
        chooseRandomChar(enter);

    }
/*    public static String enterString(){

    }*/
/*    static char[] turnStringIntoChar(){
        String name = enterString();
        char[] nameToChar = name.toCharArray();
        return nameToChar;
    }*/
    public static void chooseRandomChar(String nome){
/*        char[] stringIntoChar = turnStringIntoChar();
        char word;*/
        for (int i = 0; i < nome.length(); i++) {
/*            word = nom[i];*/
            int upOrLow = rand.nextInt(1,3);
            switch (upOrLow){
                case 1-> System.out.println(Character.toLowerCase(upOrLow));
                case 2 -> System.out.println(Character.toUpperCase(upOrLow));
            }
            System.out.print(nome);
        }
        //usar o .charAt(i)
    }
}
