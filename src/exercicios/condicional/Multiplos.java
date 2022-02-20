package exercicios.condicional;

import java.util.Locale;
import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

public class Multiplos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Informe o primeiro numero: ");
        numero1 = in.nextInt();

        System.out.println("Informe o segundo numero: ");
        numero2 = in.nextInt();

        if(numero1 % numero2 == 0){
            System.out.println("São multiplos");
        }else if (numero2 % numero1 == 0){
            System.out.println("São multiplos");
        }else{
            System.out.println("Não são multiplos");
        }

    }
}
