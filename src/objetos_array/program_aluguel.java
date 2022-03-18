package objetos_array;

import objetos_array.entidade.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class program_aluguel {
    public program_aluguel() {
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        Aluguel[] aluguel = new Aluguel[10];
        int qtdAluguel = 0;
        System.out.printf("Informe quantos estudantes alugaram o quarto: ");
        qtdAluguel = in.nextInt();

        int i;
        for(i = 0; i < qtdAluguel; ++i) {
            in.nextLine();
            System.out.printf("Informe o nome do estudante (%d)-", i + 1);
            String nome = in.nextLine();

            System.out.printf("Informe o numero do quarto do estudante (%d)-", i + 1);
            int quarto = in.nextInt();

            in.nextLine();
            System.out.printf("Informe o contato do estudante (%d)-", i + 1);
            String contatoEstudante = in.nextLine();
            aluguel[i] = new Aluguel(quarto, nome, contatoEstudante);
        }

        for(i = 0; i < aluguel.length; ++i) {
            if (aluguel[i] != null) {
                aluguel[i].print();
            }
        }

    }
}
