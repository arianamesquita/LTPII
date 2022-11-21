package Recursividade;

public class Potenciacao {
    public static void main(String[] args) {
        System.out.println(power(2,6));
    }
    public static int power(int x, int exp){
        if (exp==0){
            return 1;
        } else {
            return (x * power(x, exp - 1));
        }
    }
}
