package polimorfismo;

import polimorfismo.Entidades.Funcionario;
import polimorfismo.Entidades.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class aplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Lista para armazenar os funcionários
        List<Funcionario> lista = new ArrayList<>();

        String nome; char opcao; int horas; double bonus, valorPorHora;

        //Definição da quantidade de funcionários
        System.out.println("Informe o numero de funcionários: ");
        int qtd = in.nextInt();

        //Laço for para atribuição dos valores
        for(int i = 1; i <= qtd; i++){
            System.out.printf("\nFuncionário " + i);
            System.out.print("\nFuncionário terceirizado? S/N\n");
            opcao = in.next().charAt(0);
            System.out.print("Informe o nome: ");
            nome = in.next();
            System.out.print("Informe a quantidade de horas trabalhadas: ");
            horas = in.nextInt();
            System.out.print("Informe o valor por hora trabalhada: ");
            valorPorHora = in.nextDouble();

            //Condicional para implementação das classes e métodos.
            if(opcao == 's'){
                System.out.print("Informe um pagamento adicional: \n");
                double pagamentoAdicional = in.nextDouble();
                FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado(nome,horas,valorPorHora,pagamentoAdicional);
                lista.add(new FuncionarioTerceirizado(nome,horas,valorPorHora,pagamentoAdicional));

            }
            else {
                Funcionario funcionario = new Funcionario(nome,horas,valorPorHora);
                lista.add(new Funcionario(nome,horas,valorPorHora));
            }

        }
        System.out.println();
        System.out.println("Pagamentos");
        for(Funcionario funcionario : lista){
            System.out.println(funcionario.getNome() + " - " + funcionario.pagamento());
        }

    }
}
