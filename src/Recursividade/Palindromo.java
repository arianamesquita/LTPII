package Recursividade;

import java.util.Scanner;

public class Palindromo {
    public static int count;
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Entre com a palavra: ");
        String palavra = scan.nextLine();
        isPalindrome(palavra);
    }
/*    public static boolean palindromo(String palavra, int num){
        if (num >= 0 && num >= palavra.length()/2){
            if (palavra.charAt(num) == palavra.charAt(palavra.length() - 1 - num))
            {
                count++;
            }
            palindromo( palavra, num-1);
        }
        if (palavra.length() / 2 % 2 == 0)
        {
            return count == palavra.length()/2;
        }
        else
        {
            return count == (palavra.length()/2)+1;
        }
    }*/
    public static boolean isPalindrome(String s){
        if (s.length() < 2){
            return true;
        }
        else {
            if (s.charAt(0) != s.charAt(s.length() - 1)){
                System.out.println("O caractere " + s.charAt(0) + "é diferente de " + s.charAt(s.length() - 1));
                return false;
            }
        }
        String middle = s.substring(1, s.length()-1);
        return isPalindrome(middle);
    }

}
