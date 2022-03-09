package objetos.entidade;

import java.text.Format;

public class Estudante {
    public String nome;
    public Double notaTrimestre1;
    public Double notaTrimestre2;
    public Double notaTrimestre3;
    public Double aprovado;
    public Double reprovado;

    public Double somaNotas() {
        return this.notaTrimestre1 + this.notaTrimestre2 + this.notaTrimestre3;
    }

    public void conclusao() {

        if (somaNotas() >= 60) {
            System.out.printf("Aluno: %S\n", this.nome);
            System.out.printf("Nota: %.2f\n", somaNotas());
            System.out.println("Aluno aprovado");
            this.aprovado = (this.notaTrimestre1 + this.notaTrimestre2 + this.notaTrimestre3);
        } else {
            System.out.printf("Aluno: %S\n", this.nome);
            System.out.printf("Nota: %.2f\n", somaNotas());
            System.out.println("Aluno reprovado.");
            this.reprovado = 60 - (this.notaTrimestre1 + this.notaTrimestre2 + this.notaTrimestre3);
            System.out.printf("Faltaram %.2f pontos.", reprovado);
        }
    }
}

