package objetos.exercicios;

import objetos.entidade.retangulo;

import java.util.Locale;
import java.util.Scanner;

public class valores_retangulo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        retangulo retangulo = new retangulo();

        System.out.println("Informe a largura e a altura: ");
        retangulo.width = in.nextDouble();

        System.out.println("Informe a largura e a altura: ");
        retangulo.height = in.nextDouble();

        double area = retangulo.area();
        double perimetro = retangulo.perimetro();
        double diagonal = retangulo.diagonal();

        System.out.println("A área do retangulo é: " + area);
        System.out.println("O perímetro do retangulo é: " + perimetro);
        System.out.println("A diagonal do retangulo é: " + diagonal);
    }
}
