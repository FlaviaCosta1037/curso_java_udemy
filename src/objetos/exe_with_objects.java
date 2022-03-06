package objetos;

import objetos.entidade.triangulo;

import java.util.Locale;
import java.util.Scanner;

public class exe_with_objects {
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

        double p = (x.a + x.b + x.c) / 2;
        areaX = Math.sqrt(p * (p - x.a) * (p - x.b ) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangulo X area: %.4f%n", areaX);
        System.out.printf("Triangulo Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("O triangulo X tem a maior área.");
        } else {
            System.out.println("O triangulo Y tem a maior área.");
        }

    }
}
