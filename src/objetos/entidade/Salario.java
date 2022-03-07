package objetos.entidade;

public class Salario {
    public String nome;
    public Double salario;
    public Double imposto;

    public Double salarioLiquido(){
        return salario - imposto;
    }
    public void aumentoSalario(double porcentagem){
        salario += salario * (porcentagem / 100.00);
    }
    @Override
    public String toString() {
        return nome  + " R$ " + String.format("%.2f", salario);
    }
}
