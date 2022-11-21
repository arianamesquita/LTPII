package Revisao;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class HuntingWords {
    public static final int BOARD_SIZE = 20;
    public static final int QUANTITY_WORDS = 6;
    public static String word;
    public static char[][] loneWords;
    static Random random = new Random();

    public static void main(String[] args) {
        matrizJogo();
        putWordsBackboard(loneWords);
        printBoardChar(loneWords);
        linesWithWords(loneWords);
        //finalPrint(loneWords);
        printBoardChar(loneWords);
    }
    public static char[][] matrizJogo() {
        loneWords = new char[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                loneWords[i][j] = '.';
            }
        }
        return loneWords;
    }
    static char[][] finalPrint(char[][] n){
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (n[i][j] == '.'){
                    char randomChar = (char)(random.nextInt(26) + 'a');
                    n[i][j] = randomChar;
                }
            }
        }
        return n;
    }
    static void printBoardChar(char[][] n) {
        for (int o = 0; o < BOARD_SIZE; o++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(" " + n[o][j] + " ");
            }
            System.out.print(" | " + o);
            System.out.println(" ");
        }
    }
    public static String chooseWords() {
        int line = random.nextInt(35);
        try (BufferedReader br = new BufferedReader(new FileReader("src/Revisao/words.txt"))){
            for (int i = 0; i < line; i++) // escolhe palavras aleatórias no file
            word = br.readLine();
        }catch (IOException e){
            System.out.println(e);
        }
        return word;
    }
    static char[][] putWordsBackboard (char [][] n){
/*        int[] hasWord = new int[QUANTITY_WORDS];*/
        int a, b, count = 0;
        String words;
        while (count < QUANTITY_WORDS){
            do{
                a = random.nextInt(0,BOARD_SIZE);
            } while (!(hasWordInLine(loneWords, a)));
            do{
                words = chooseWords();
                b = random.nextInt(0,BOARD_SIZE);
            } while (words.length() - b < 0 || words.length() + b > BOARD_SIZE);
            char[] wordToChar = words.toCharArray();
            if (hasWordInLine(loneWords, a)){
                if (b + words.length() < BOARD_SIZE) {
                    for (int i = 0; i < wordToChar.length; i++) {
                        loneWords[a][b + i] = wordToChar[i];
                    }
                }
            }
/*            for (int k = 0; k < QUANTITY_WORDS; k++) {
                hasWord[k] = a;
            }
            System.out.println(Arrays.toString(hasWord));*/
            count++;
            System.out.println(words);
        }
        return n;
    }
    private static boolean hasWordInLine (char[][] n, int a){
        boolean y = true;
        for (int i = 0; i < BOARD_SIZE-1; i++) {
            if (n[a][i] != '.') {
                y = false;
            }
        }
        return y;
    }
    static void linesWithWords(char[][] n){
        int c = 0;
        int[] hasWord = new int[QUANTITY_WORDS];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (n[i][j] != '.'){
                    for (int k = 0; k < QUANTITY_WORDS; k++)
                        hasWord[c + k] = i;
                }
            }
        }
        System.out.println(Arrays.toString(hasWord));
    }
}