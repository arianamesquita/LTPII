package Revisao;

public class exercicio2Swap {
    public static void main(String[] args) {
        int k = 42;
        int q = 44;

        System.out.println("O primeiro n�mero �: " + swapK(k,q));
        System.out.println("O segundo n�mero �: " + swapQ(k,q));

    }
    public static int swapK(int a, int b){
        a = b;
        return a;
    }
    public static int swapQ(int a, int b){
        b = a;
        return b;
    }
}
