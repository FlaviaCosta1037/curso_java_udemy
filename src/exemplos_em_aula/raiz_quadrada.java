package exemplos_em_aula;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class raiz_quadrada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double x = 3.0;
        float y = 4f; // f no final do valor pode ser uma forma de identificar que o valor é flutuante (float)
        double z = -5d; // d no final do valor pode ser uma forma de identificar que o valor é double (double)
        double A, B, C;

        A =  Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A =  Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevedo ao quadrado = " + C);

        A = Math.abs(y); //O valor absoluto retira o sinal negativo caso ele exista
        B = Math.abs(z);

        System.out.println("O valor absoluto de " + y + " = " + A);
        System.out.println("O valor absoluto de " + z + " = " + B);


    }
}
