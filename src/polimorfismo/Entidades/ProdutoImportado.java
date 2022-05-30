package polimorfismo.Entidades;

public class ProdutoImportado extends Produto{
    private double taxaAlfandega;

    public ProdutoImportado(){

    }
    public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }
    public double precoTotal(){
        return getPreco() + this.taxaAlfandega;
    }
    @Override
    public String etiquetaPreco(){
        return super.etiquetaPreco();
    }

    @Override
    public String toString() {
        return getNome() + " " + precoTotal() + " TaxaAlfandega : " + taxaAlfandega;
    }
}
