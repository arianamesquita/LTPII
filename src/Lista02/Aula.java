package Lista02;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aula {
    public static void main(String[] args) {
        //Mínimo de 8 e maximo de 16 caracteres
        //Deve incluir pelo menos um numero e duas letras
        //Deve incluir pelo menos uma letra maiuscula e outra minuscula
        //Pode conter caracters especiais
        //Nao pode conter numeros em sequencia
        //Nao pode conter espacos em branco
        //\^ - [a-z] | [_] - aceita _ em qualquer lugar
        //\d{1,}\w{2,} - inicia com 1 número e 2 letras depois
        //\d{1,}\w{2,}+[a-z]{1}+[A-Z]{1}
        //Pattern pattern = Pattern.compile("\\d{1,}\\w{2,}-"); //Expressão regular
        //String regex = "\\p{IsAlphabetic}";
        //^\p{Lower}{3}+$
        //^\p{IsAlphabetic}|^[_][A-z]{2}$ - começar com letra ou underline
        //\p{Isdigit}{0,1}${8,16}

        Pattern pattern = Pattern.compile("^\\p{IsUpper}{1,}\\p{IsLower}{1,}\\p{Isdigit}{1,}$" + "^\\s*.*\\s*$"); //Expressão regular

        Matcher matcher = pattern.matcher("Aa1");

        boolean found = matcher.find();

        System.out.printf("Padrão Encontrado -> %s", (found ? "Sim" : "Não"));



    }
}
