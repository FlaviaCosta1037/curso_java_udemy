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
    //Construtor com todos os dados
    public Conta(int numero, String titular, Double valor) {
        this.numero = numero;
        this.titular = titular;
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

    public Double deposito(Double valorDeposito)
    {
        return this.valor += valorDeposito;
    }

    public Double retirada(Double valorRetirada)
    {
        return this.valor -= (valorRetirada + 5.00);
    }

    public void imprimir(){
        System.out.printf("Conta: %d, Titular: %S, Saldo: R$ %.2f ", this.numero, this.titular, this.valor);
    }

}
