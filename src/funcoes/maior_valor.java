package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class maior_valor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.println("Informe os 3 valores: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int maiorValor = maior(a, b, c); //Função criada para calcular o maior valor.

        mostreResultado(maiorValor); //Função criada para mostrar o maior valor calculado.
    }

    //Método para calcular a função do maior valor
    public static int maior(int x, int y, int z){
        int auxiliar; //Variável auxiliar para receber o maior valor

        if (x > y && x > z){
            auxiliar = x;
        }else if (y > z){
            auxiliar = y;
        }else{
            auxiliar = z;
        }
        return auxiliar;
    }

    //Metodo criado para mostrar o resultado
    public static void mostreResultado (int valor){
        System.out.println("O maior valor é: " + valor);
    }
}