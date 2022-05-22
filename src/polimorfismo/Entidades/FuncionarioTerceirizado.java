package polimorfismo.Entidades;

public class FuncionarioTerceirizado extends Funcionario{
    private double bonus;

    public FuncionarioTerceirizado(){

    }
    public FuncionarioTerceirizado(String nome, int horas, double valor, double bonus) {
        super(nome, horas, valor);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double pagamento(){
        return  super.pagamento() + bonus * 1.1;
    }
}
