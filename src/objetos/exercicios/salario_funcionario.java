package objetos.exercicios;

import objetos.entidade.Salario;

import java.util.Locale;
import java.util.Scanner;

public class salario_funcionario {
    public static void main(String[] args){
        Salario salario = new Salario();
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Informe o nome do funcionário: ");
        salario.nome = in.nextLine();
        System.out.println("Informe o salário Bruto do funcionário: ");
        salario.salario = in.nextDouble();
        System.out.printf("Informe o valor do imposto: ");
        salario.imposto = in.nextDouble();

        System.out.println("Nome do funcionario: " +  salario.nome);
        System.out.printf("Salário Bruto: R$ %.2f\n ", salario.salario);
        System.out.printf("Imposto: R$ %.2f\n", salario.imposto);
        System.out.printf("Salário Liquido: R$ %.2f\n", salario.salarioLiquido());

        System.out.println("Informe um percentual de aumento no salário Bruto: ");
        double porcentagem = in.nextDouble();
        salario.aumentoSalario(porcentagem);

        System.out.println();
        System.out.println(salario);

    }
}
