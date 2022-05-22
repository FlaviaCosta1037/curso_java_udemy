package polimorfismo.Entidades;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class aplicacaoProduto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //ArrayList
        List<Produto> lista = new ArrayList<>();

        //Variáveis
        int qtdProdutos; char escolha; String nome; double preco, taxaAlfandega;


        System.out.printf("Informe a quantidade de produtos: ");
        qtdProdutos = in.nextInt();

        //Laço for para atribuição das variáveis
        for(int i = 1; i <= qtdProdutos; i++){
            System.out.printf("\nProduto " + i);
            System.out.printf("O produto é comum, usado ou importado? c/u/i ");
            escolha = in.next().charAt(0);
            System.out.print("Nome: ");
            nome = in.next();
            System.out.print("Preço: ");
            preco = in.nextDouble();

            if(escolha == 'i'){
                System.out.println("Taxa de alfandega: ");
                taxaAlfandega = in.nextDouble();
                ProdutoImportado produto = new ProdutoImportado(nome,preco,taxaAlfandega);
                lista.add(new ProdutoImportado(nome,preco,taxaAlfandega));
            } else if(escolha == 'u'){
                System.out.print("Data de fabricação: ");
                String leituraData = in.next();
                DateFormat data = new SimpleDateFormat("dd/MM/yyy");

                //Continar a partir da data.
            }
        }
    }
}
