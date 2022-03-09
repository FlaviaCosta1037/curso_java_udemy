package construtores;
import construtores.entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class programa_produtos {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        //Interação com o usuário

        System.out.println("Informe o produto a seguir... ");
        System.out.print("Nome do produto: ");
        String nome = in.nextLine(); //Guardando o nome do produto no campo nome do produto.

        System.out.println("Informe o preço do produto: ");
        double preço = in.nextDouble();

        System.out.println("Informe a quantidade do produto: ");
        int quantidade = in.nextInt();

        //Chamando via construtor criado na classe produto.

        Produto produto = new Produto(nome, preço, quantidade);

        //Para que o programa imprima corretamente, é necessário adicionar um método toString a class produto.
        System.out.println(); //Criado para pular uma linha
        System.out.println("Dados dos produtos no estoque: " + produto);

        System.out.println();
        System.out.println("Entre com o numero de produtos para serem adicionados ao estoque: ");
        quantidade = in.nextInt();
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
