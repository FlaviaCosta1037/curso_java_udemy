package exercicios;
import java.util.Locale;
import java.util.Scanner;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.

public class exe02 {

    public static void main(String[] args) {
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);
        Scanner in = new Scanner(System.in);

        double raio = 0;

        System.out.println("Informe o valor do raio do circulo: ");
        raio = in.nextDouble();

        double area = 3.14159 * (raio * raio);

        System.out.println("Resultado: " + area);

    }

}
