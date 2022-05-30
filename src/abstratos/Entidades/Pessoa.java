package abstratos.Entidades;

public abstract class Pessoa {
    //Objetos default
    private String nome;
    private double rendaAnual;

    //Construtor Padrão
    public Pessoa(){
    }
    //Construtor com Padrão
    public Pessoa(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }
    //Métodos getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    //Método Abstrato
    public abstract double CalcularImposto();
}
