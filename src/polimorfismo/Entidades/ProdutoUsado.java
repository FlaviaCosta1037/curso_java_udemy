package polimorfismo.Entidades;

public class ProdutoUsado extends Produto {
    private String dataFabricacao;

    public ProdutoUsado(){

    }
    public ProdutoUsado(String nome, double preco, String dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    @Override
    public String etiquetaPreco(){
        return super.etiquetaPreco();
    }

    @Override
    public String toString() {
        return getNome() + " (usado) " + getPreco() + " Data de Fabricacão: " + dataFabricacao;
    }
}
