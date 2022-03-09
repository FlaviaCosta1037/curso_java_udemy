package construtores.entidades;

public class Produto {
        public String nome;
        public double preço;
        public int quantidade;

        //Criando o construtor;

        public Produto (String nome, double preço, int quantidade){
            this.nome = nome;
            this.preço = preço;
            this.quantidade = quantidade;
        }

        //Criando método para calcular o valor total em estoque.
        public double valorTotalEstoque (){
            return preço * quantidade;
        }

        //Criando método para incluir e calcular a quantidade do produto no estoque.
        public void addProdutos (int quantidade){
            this.quantidade += quantidade;
        }

        //Criando método para retirar e calcular a quantidade do produto no estoque.
        public void removeProdutos (int quantidade){
            this.quantidade -= quantidade;
        }

        //Criando um método toString para imprimir na tela da main os resultados totalmente formatados.
        public String toString(){
            return nome + " " + String.format("Quantidade %d ", quantidade) + " R$"
                    + String.format("%.2f ",preço)  + String.format("Valor total R$ %.2f ",valorTotalEstoque());
        }
    }
