package exercicios;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

public class exe05 {
    public static void main(String[] args) {
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);
        Scanner in = new Scanner(System.in);

        String peca1, peca2;
        int quantidadePeca1, quantidadePeca2;
        float valorPeca1, valorPeca2;

        System.out.println("Informe o codigo da primeira peça: ");
        peca1 = in.next();

        System.out.println("Informe a quantidade: ");
        quantidadePeca1 = in.nextInt();

        System.out.println("Informe o valor da peça: ");
        valorPeca1 = in.nextFloat();

        System.out.println("Informe o codigo da primeira peça: ");
        peca2 = in.next();

        System.out.println("Informe a quantidade: ");
        quantidadePeca2 = in.nextInt();

        System.out.println("Informe o valor da peça: ");
        valorPeca2 = in.nextFloat();

        float valorFinal = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);

        System.out.printf("O valor a pagar é: R$ %.2f", valorFinal);
    }
}
