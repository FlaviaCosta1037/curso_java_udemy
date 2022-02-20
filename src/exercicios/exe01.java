package exercicios;
import java.util.Locale;
import java.util.Scanner;

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

public class exe01 {

    public static void main(String[] args) {
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);

        int numero1 = 10;
        int numero2 = 30;
        int soma = numero1 + numero2;

        System.out.println(soma);

    }
}

