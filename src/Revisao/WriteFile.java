package Revisao;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {

        try {
            BufferedWriter wt = new BufferedWriter(new FileWriter("testedearquivo.txt", true));
            //esse true faz pular pra proxima linha////////////................/
            wt.write("Oi! \n");
            wt.write("Tudo bem? \n");
            wt.close();

            BufferedReader rd = new BufferedReader(new FileReader ("testedearquivo.txt"));

            String line;
            while ((line = rd.readLine()) != null){
                System.out.println(line);
            }
            rd.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}

