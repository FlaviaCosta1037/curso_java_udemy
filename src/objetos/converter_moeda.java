package objetos;

import objetos.util.ConversaoMoeda;

import java.util.Locale;
import java.util.Scanner;

public class converter_moeda {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos dolares?");
        double valorDolar = in.nextDouble();

        double c = ConversaoMoeda.conversor(valorDolar);

        System.out.printf("Valor total: R$ %.2f", c);

    }
}
