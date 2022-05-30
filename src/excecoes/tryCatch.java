package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Digite os nomes desejados: ");
            String[] vetor = in.nextLine().split(" ");
            System.out.println("Informe a posicao que deseja exibir: ");
            int posicao = in.nextInt();
            System.out.println(vetor[posicao]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Posição inválida!");
        }
        catch (InputMismatchException e){
            System.out.println("Valor inválido!");
        }
        System.out.println("Fim do programa!");

    }
}
