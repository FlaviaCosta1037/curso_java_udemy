package exemplos_em_aula;

import java.util.Locale;
import java.util.Scanner;

public class operacao_split {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        String s = "potato apple lemon";

        //Operação split separa as strings contidas numa frase a partir dos espaços em branco
        String vect [] = s.split(" "); //usar o espaço em branco como separador.

        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}