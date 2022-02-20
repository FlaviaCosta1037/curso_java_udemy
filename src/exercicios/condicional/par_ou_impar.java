package exercicios.condicional;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class par_ou_impar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int numero = 0;

        if (numero %2 == 0){
            System.out.println("Número Par");
        }else{
            System.out.println("Numero impar");
        }

    }
}
