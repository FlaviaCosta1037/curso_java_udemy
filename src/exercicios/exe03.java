package exercicios;
import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

public class exe03 {
    public static void main(String[] args) {
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);
        Scanner in = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("Informe um valor: ");
        a = in.nextInt();

        System.out.println("Informe um valor: ");
        b = in.nextInt();

        System.out.println("Informe um valor: ");
        c = in.nextInt();

        System.out.println("Informe um valor: ");
        d = in.nextInt();

        int diferenca = (a * b) - (c * d);

        System.out.println(diferenca);

    }
}
