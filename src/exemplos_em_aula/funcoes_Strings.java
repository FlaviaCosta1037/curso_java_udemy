package exemplos_em_aula;

import java.util.Locale;
import java.util.Scanner;

public class funcoes_Strings {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        String original = "abcde FGHIJ ABC abc DEFG";

        String s1 = original.toLowerCase(); //Coloca todas as letras para minúsculos.
        String s2 = original.toUpperCase(); //Coloca todas as letras para maiúsculas
        String s3 = original.trim(); //Retira os espaços dos cantos da string.
        String s4 = original.substring(2); // Gera uma nova string do caracter selecionado para frente. "cde FGHIJ ..."
        String s5 = original.substring(2,9); //Recorta o caracter que está entre as posições da string "ex: 2 e 9
        String s6 = original.replace('a', 'x'); //Substitui na variavel original todas as letras a por x.
        String s7 = original.replace("abc", "xy");
        int i = original.indexOf("bc"); //Informa a primeira posição dos caracteres bc
        int j = original.lastIndexOf("bc"); //Informa a ultima posição dos caracteres bc

        System.out.println("Original: -" + original + " - ");
        System.out.println("toLowerCase: -" + s1 + "-");

        System.out.println("Original: -" + original + " - ");
        System.out.println("toUperCase: -" + s2 + "-");

        System.out.println("Original: -" + original + " - ");
        System.out.println("trim: -" + s3 + "-");

        System.out.println("Original: -" + original + " - ");
        System.out.println("substring(2): -" + s4 + "-");

        System.out.println("Original: -" + original + " - ");
        System.out.println("substring(2 , 9): -" + s5 + "-");

        System.out.println("Original: -" + original + " - ");
        System.out.println("Replace (abc por xy): -" + s7 + "-");

        System.out.println("indexOf (bc): -" + i + "-");
        System.out.println("lastIndexOf (bc): -" + j + "-");

    }
}
