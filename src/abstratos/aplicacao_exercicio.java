package abstratos;

import abstratos.Entidades.Pessoa;
import abstratos.Entidades.PessoaFisica;
import abstratos.Entidades.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class aplicacao_exercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Pessoa> lista = new ArrayList<>();
        double soma = 0.0;

        System.out.print("Informe o número de contribuintes: ");
        int numero = in.nextInt();

        for(int i = 1; i <= numero; i++){
            System.out.printf("Dados do contribuinte Nº %d: \n", i);
            System.out.print("PF ou PJ: f/j\nDigite: ");
            char opcao = in.next().charAt(0);

            System.out.print("Nome: ");
            String nome = in.next();
            System.out.print("Renda anual: ");
            double rendaAnual = in.nextDouble();

            if(opcao == 'f') {
                System.out.print("Despesa com saúde: ");
                double despesaSaude = in.nextDouble();
                lista.add(new PessoaFisica(nome,rendaAnual,despesaSaude));

            } else{
                System.out.print("Nº de funcionários: ");
                int quantidade = in.nextInt();
                lista.add(new PessoaJuridica(nome,rendaAnual,quantidade));
            }
        }
        System.out.println();
        System.out.println("Impostos pagos ");
        for (Pessoa pessoa : lista) {
            System.out.println("" + pessoa.getNome() + " " + String.format("%.2f",pessoa.CalcularImposto()));
            soma += pessoa.CalcularImposto();
        }
        System.out.println("Total de impostos pagos");
        System.out.println(soma);

    }
}
