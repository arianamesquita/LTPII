package Revisao;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Arrays;

public class TryCatch {
    public static void main(String[] args) {
/*        try{
            int a = 9;
            int b = 5;
            int c = a / b - 5;
            System.out.println("Hello");
        }
        catch (Exception e){
            System.out.println("C");
        }
        finally {
            System.out.println("sharp");
        }*/

/*        int[] arr = new int[10];
        try{
            System.out.println(arr[9001]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("número extrapola tamanho do array de: " + arr.length);
        }*/

        int[] arr = new int[20];
        try{
            for (int i = 0; i < 50; i++) {
                arr[i] = 1;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("número extrapola tamanho do array de: " + arr.length);
        }

        int[] arr2 = { 2, 4, 6, 8, 10 };
        int c = 0;
        try{
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 10; j >= 0; j--) {
                    c = arr2[i] / j;
                }
            }
            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println("número não divide por zero");
        }

        String[] arr3 = new String[10];
        try (BufferedReader arch = new BufferedReader(new FileReader("C:\\Users\\arian\\OneDrive\\Sistemas Informação\\2.1. LTPII"))){
            for (int i = 0; i < arr3.length; i++) {
                arr3[i] = arch.readLine();
            }
        } catch (IOException d){
        System.out.println("File not found");
        }

    }
}
