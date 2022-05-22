package polimorfismo.Entidades;

public class Funcionario {
    private String nome;
    private int horas;
    private double valor;

    //Construtor padrão
    public Funcionario(){
        super();
    }
    public Funcionario(String nome, int horas, double valor) {
        this.nome = nome;
        this.horas = horas;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double pagamento(){
        return this.valor * this.horas;
    }

    @Override
    public String toString() {
        return "" +
                "" + nome + '\'' +
                "" + horas +
                "" + valor;
    }
}
