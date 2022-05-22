package polimorfismo.Entidades;

public class Produto {
    private String nome;
    private double preco;

    //Construtor Padrão
    public Produto(){
        super();
    }
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String etiquetaPreco(){
        return this.nome + "-" + this.preco;
    }

    @Override
    public String toString() {
        return "" + this.nome + " " +  this.preco;
    }
}
