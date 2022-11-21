package Revisao;
import java.io.File;
import java.util.Scanner;

public class FileTeach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o nome do arquivo ou diretório:");
        analyzePath(input.nextLine());
    }
    public static void analyzePath(String path){
        File name = new File(path);
        if(name.exists()){
            System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
                    name.getName(), " exists",
                    (name.isFile() ? " is a file" : " is not a file"),
                    (name.isDirectory() ? " is a directory" : " is not a directory"),
                    (name.isAbsolute() ? " is a absolute path" : " is not a absolute path"),
                    "Last modified: ", name.lastModified(),
                    "Length: ", name.length(),
                    "Path:", name.getPath(),
                    "Absolute Path:" , name.getAbsolutePath(),
                    "Parent:", name.getParent());
            if(name.isDirectory()){
                String[] directory = name.list();
                System.out.println("\n\n Quantidade de itens: " + directory.length);
                System.out.println("\n\n Directory contents:\n");
                int[] count = new int[6];
                for(String directoryName : directory){
                    if(directoryName.contains("(1)"))
                        count[0]++;
                    else if(directoryName.contains("(2)"))
                        count[1]++;
                    else if(directoryName.contains("(3)"))
                        count[2]++;
                    else if(directoryName.contains("(4)"))
                        count[3]++;
                    else  if(directoryName.contains("(5)"))
                        count[4]++;
                    else if(directoryName.contains("(6)"))
                        count[5]++;

                }
                System.out.println("Quantidade de arquivos baixados 2 vezes: " +
                        count[0]);
                System.out.println("Quantidade de arquivos baixados 3 vezes: " +
                        count[1]);
                System.out.println("Quantidade de arquivos baixados 4 vezes: " +
                        count[2]);
                System.out.println("Quantidade de arquivos baixados 5 vezes: " +
                        count[3]);
                System.out.println("Quantidade de arquivos baixados 6 vezes: " +
                        count[4]);
                System.out.println("Quantidade de arquivos baixados 7 vezes: " +
                        count[5]);

            }//fim do if isDirectory
        }//fim do if externo exists
        else{ //se não for arquivo ou diretório, gera uma mensagem de erro:
            System.out.printf("%s %s", path, "does not exists.");
        }//fim do else
    }//fim do método
}//fuim da classe

