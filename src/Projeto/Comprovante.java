package Projeto;

import java.io.*;
import java.util.Scanner;

public class Comprovante {
    public static File comprovante = new File("C:\\Users\\arian\\OneDrive\\Sistemas Informação\\2.1. LTPII\\LTPII\\src\\Projeto\\Comprovante.txt");
    public static Scanner scan;
    static {
        try {
            scan = new Scanner(comprovante);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        writeFile();
        while (scan.hasNext()){
            readPrintFile();
        }
    }
    public static void writeFile() throws IOException {
        BufferedWriter wr = new BufferedWriter(new FileWriter(comprovante, true));
        wr.write("teste ");
        wr.write("em frente ");
        wr.write("de novo.");
        wr.newLine();
        wr.close();
    }
    public static void readPrintFile() throws IOException {
/*        BufferedReader rd = new BufferedReader(new FileReader(comprovante));
        System.out.println(rd.readLine());*/
        System.out.printf("1: %s, 2: %s, o 3: %s, 4: %s, 5: %s",
                scan.next(), scan.next(), scan.next(), scan.next(), scan.next());
        System.out.println(" ");
    }
}
