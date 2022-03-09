package objetos.exercicios;

import objetos.entidade.Estudante;

import java.util.Locale;
import java.util.Scanner;


public class nota_aluno {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Estudante estudante = new Estudante();

        System.out.println("Informe o nome do aluno:");
        estudante.nome = in.next();
        System.out.println("Informe a nota do primeiro trimestre: ");
        estudante.notaTrimestre1 = in.nextDouble();
        System.out.println("Informe a nota do segundo trimestre: ");
        estudante.notaTrimestre2 = in.nextDouble();
        System.out.println("Informe a nota do terceiro trimestre: ");
        estudante.notaTrimestre3 = in.nextDouble();

        estudante.conclusao();

    }
}
