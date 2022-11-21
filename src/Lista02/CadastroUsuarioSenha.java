package Lista02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadastroUsuarioSenha {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        checkUsers();
    }

    static void checkUsers() {
        String user;
        System.out.println("Entre com o nome de usuário: ");
        System.out.println("O nome de usuário deve começar com uma letra ou underline," +
                "\n pode conter apenas letras, números ou underline," +
                "\n mínimo de 8 e máximo de 16 caracteres," +
                "\n não pode conter caracteres especiais ($%#@!)," +
                "\n não pode conter espaços em branco.");

        boolean a;
        do {
            a = true;
            user = scan.nextLine();
            //usar Character.IsLetter
            //user.substring(0) != "{\\{isAlphabetic}" || user.substring(0) != "_"
            if (user.substring(0) != "{\\p{isAlphabetic}}" || user.substring(0) != "_") {
                System.out.println("Tente novamente.");
                a = false;
            } else {
                try {
                    BufferedWriter wt = new BufferedWriter(new FileWriter("src/Lista02/Users", true));
                    wt.write(user);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } while (!a);

    }
}
