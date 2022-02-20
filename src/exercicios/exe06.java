package exercicios;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

public class exe06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        float valorA, valorB, valorC, areaTrianguloRetangulo, areaQuadrado, areaRetangulo, areaTrapezio;
        double pi = 3.14159, areaCirculo;

        System.out.println("Informe o valor de A: ");
        valorA = in.nextFloat();

        System.out.println("Informe o valor de B: ");
        valorB = in.nextFloat();

        System.out.println("Informe o valor de C: ");
        valorC = in.nextFloat();

        areaTrianguloRetangulo = (valorA * valorC) / 2;
        areaCirculo = (valorC * valorC) * pi;
        areaTrapezio = ((valorA + valorB) * valorC) / 2;
        areaQuadrado = valorB * valorB;
        areaRetangulo = valorA * valorB;

        System.out.printf("%.3f \n" , areaTrianguloRetangulo);
        System.out.printf("%.3f \n" , areaCirculo);
        System.out.printf("%.3f \n" , areaTrapezio);
        System.out.printf("%.3f \n" , areaQuadrado);
        System.out.printf("%.3f \n" , areaRetangulo);

    }

}
