package polimorfismo.Entidades;

import java.util.Date;

public class ProdutoUsado extends Produto {
    private Date dataFabricacao;

    public ProdutoUsado(){

    }
    public ProdutoUsado(String nome, double preco, Date dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    @Override
    public String etiquetaPreco(){
        return super.etiquetaPreco();
    }

}
