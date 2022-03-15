package objetos.entidade;

import java.util.Locale;

public class Conta {
    private int numero;
    private String titular;
    private Double valor;
    private Double taxa;

    //Construtor sem o valor da conta, pois pode iniciar zerado

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;

    }

    public Conta(int numero, String titular, Double valor) {
        this.numero = numero;
        this.titular = titular;
        this.valor = valor;

    }
    //Construtor com todos os dados

    public Conta(int numero, String titular, Double valor, Double taxa) {
        this.numero = numero;
        this.titular = titular;
        this.valor = valor;
        this.taxa = taxa;
    }

    public Conta(Double valor) {
        this.valor = valor;

    }

    //Acessar o nome do titular da conta
    public String getTitular() {
        return titular;
    }

    //Pode alterar o nome do titular da conta
    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Acessar o numero da conta
    public int getNumero() {
        return numero;
    }

    //Acessar o valor da conta. Só pode ser alterado mediante depositos e retiradas. Vide métodos.
    public Double getValor() {
        return valor;
    }

    public Double deposito(Double deposito){
        return this.valor += valor;
    }

    public Double retirada(Double retirada){
        return this.valor -= valor;
    }

    public Double saldo(){
        return this.getValor() + deposito(valor) - retirada(valor);
    }
    public void imprimir(int conta, String titular, Double valor){
        System.out.printf("Conta: %d, Titular: %S, Saldo: R$ %.2f ", this.numero, this.titular, this.getValor());
    }

}
