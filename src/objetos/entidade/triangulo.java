package objetos.entidade;

/*Classe triangulo criada com o método para aplicação no código principal.*/

public class triangulo {
    public double a;
    public double b;
    public double c;

    public double area(){
    double p = (a + b + c) / 2;
    double resultado = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    return resultado;
    /* O return pode ser direto o resultado.
    * return Math.sqrt(p * (p - a) * (p - b) * (p - c);*/
    }
}

