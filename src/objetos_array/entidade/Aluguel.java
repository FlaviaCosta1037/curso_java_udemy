package objetos_array.entidade;

public class Aluguel {
    private int quarto;
    private String nome;
    private String contato;

    public Aluguel(int quarto, String nome, String contato) {
        this.quarto = quarto;
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public void print(){
        System.out.printf("\nQuarto: %d  Nome: %s  E-mail: %s ", this.quarto, this.nome, this.contato);
    }

}
