package abstratos.Entidades;

public class PessoaFisica extends Pessoa {
    private double gastoComSaude;

    public PessoaFisica() {
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

    //Método para calcular imposto
    @Override
    public double CalcularImposto() {
        if (getRendaAnual() > 20000.00) {
            return (getRendaAnual() * 0.25) - (gastoComSaude * 0.5);
        } else {
            return (getRendaAnual() * 0.15) - (gastoComSaude * 0.5);
        }
    }
}
