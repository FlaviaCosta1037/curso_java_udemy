package objetos;

import objetos.entidade.triangulo;

import java.util.Locale;
import java.util.Scanner;

public class exe_objects_methods {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double areaX, areaY;

        triangulo x, y;
        x = new triangulo();
        y = new triangulo();

        System.out.println("Informe as medidas do triangulo X: ");
        x.a = in.nextFloat();
        x.b = in.nextFloat();
        x.c = in.nextFloat();

        System.out.println("Informe as medidas do triangulo Y: ");
        y.a = in.nextFloat();
        y.b = in.nextFloat();
        y.c = in.nextFloat();

        //Retornando o método criado na classe triangulo
        areaX = x.area();
        areaY = y.area();

        System.out.printf("Triangulo X area: %.4f%n", areaX);
        System.out.printf("Triangulo Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("O triangulo X tem a maior área.");
        } else {
            System.out.println("O triangulo Y tem a maior área.");
        }

    }
}
