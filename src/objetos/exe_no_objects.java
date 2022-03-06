package objetos;

import java.util.Locale;
import java.util.Scanner;

public class exe_no_objects {

    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double triangulX, trianguloY, areaX, areaY;

        System.out.println("Informe as medidas do triangulo X: ");
        double xA = in.nextFloat();
        double xB = in.nextFloat();
        double xC = in.nextFloat();

        System.out.println("Informe as medidas do triangulo Y: ");
        double yA = in.nextFloat();
        double yB = in.nextFloat();
        double yC = in.nextFloat();

        double p = (xA + xB + xC) / 2;
        areaX = Math.sqrt(p* (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        areaY = Math.sqrt(p* (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangulo X area: %.4f%n", areaX);
        System.out.printf("Triangulo Y area: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("O triangulo X tem a maior área.");
        }else{
            System.out.println("O triangulo Y tem a maior área.");
        }

    }

}
