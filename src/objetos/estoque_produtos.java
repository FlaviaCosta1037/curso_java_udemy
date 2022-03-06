package objetos;

import objetos.entidade.Produto;

import java.util.Locale;
import java.util.Scanner;

public class estoque_produtos {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        //Declarando uma variável do tipo produto (O tipo da classe criada)
        Produto produto = new Produto();

        //Interação com o usuário

        System.out.println("Informe o produto a seguir... ");
        System.out.print("Nome do produto: ");
        produto.nome = in.nextLine(); //Guardando o nome do produto no campo nome do produto.

        System.out.println("Informe o preço do produto: ");
        produto.preço = in.nextDouble();

        System.out.println("Informe a quantidade do produto: ");
        produto.quantidade = in.nextInt();


    }
}
