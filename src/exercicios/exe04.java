package exercicios;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

public class exe04 {
    public static void main(String[] args) {
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);
        Scanner in = new Scanner(System.in);

        int numeroFuncionario, qtdHorasTrab;
        float valorPorHora, salarioFuncionario;

        System.out.println("Informe o numero de funcionários da empresa: ");
        numeroFuncionario = in.nextInt();

        System.out.println("Informe o numero de horas trabalhadas da empresa: ");
        qtdHorasTrab = in.nextInt();

        System.out.println("Valor da hora trabalhada: ");
        valorPorHora = in.nextFloat();

        System.out.println("Numero do funcionário: " + numeroFuncionario);

        salarioFuncionario = valorPorHora * qtdHorasTrab;

        System.out.printf("O Salário do funcionário é R$ %.2f", salarioFuncionario);
    }
}
