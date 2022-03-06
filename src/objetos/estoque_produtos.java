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

        //Para que o programa imprima corretamente, é necessário adicionar um método toString a class produto.
        System.out.println(); //Criado para pular uma linha
        System.out.println("Dados dos produtos no estoque: " + produto);

        System.out.println();
        System.out.println("Entre com o numero de produtos para serem adicionados ao estoque: ");
        int quantidade = in.nextInt();
        produto.addProdutos(quantidade); //Realiza a atualização com a qtd add dentro do estoque

        System.out.println(); //Criado para pular uma linha
        System.out.println("Produtos atualizados no estoque: " + produto);

        System.out.println("Entre com o numero de produtos para serem removidos do estoque: ");
        quantidade = in.nextInt();
        produto.removeProdutos(quantidade); //Realiza a atualização com a qtd remov dentro do estoque

        System.out.println(); //Criado para pular uma linha
        System.out.println("Produtos atualizados no estoque: " + produto);
    }
}
