package abstratos.Entidades;

public class PessoaFisica extends Pessoa{
    private double gastoComSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, double rendaAnual, double gastoComSaude) {
        super(nome, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    public double getGastoComSaude() {
        return gastoComSaude;
    }

    public void setGastoComSaude(double gastoComSaude) {
        this.gastoComSaude = gastoComSaude;
    }

    //Continuar no calculo do imposto
    @Override
    public double CalcularImposto() {
        return 0;
    }
}
