package polimorfismo;

import polimorfismo.Entidades.Produto;
import polimorfismo.Entidades.ProdutoImportado;
import polimorfismo.Entidades.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class aplicacaoProduto {
    public static void main(String[] args) throws ParseException {
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
            System.out.printf("\nO produto é comum, usado ou importado? c/u/i\n");
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

                SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
                Date dataFab = data.parse(leituraData);
                data.format(dataFab);

                ProdutoUsado produto = new ProdutoUsado(nome,preco, data.format(dataFab));
                lista.add(new ProdutoUsado(nome, preco, data.format(dataFab)));

            } else {
                Produto produto = new Produto(nome,preco);
                lista.add(new Produto(nome,preco));
            }
        }
        for (Produto produtos:lista) {
            System.out.println(produtos);
        }
    }
}
