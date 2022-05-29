package excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class blocoFinally {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        File arquivo = new File("C:\\Users\\Flávia\\Documents\\EstudosSabado.txt");
        Scanner in = null;

        try{
            //Scanner faz a leitura do conteúdo do arquivo
            in = new Scanner(arquivo);
            //Laço de repetiação para leitura das linhas internas do arquivo
            while(in.hasNextLine()){
                System.out.println(in.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Erro ao abrir o arquivo! " + e.getMessage());
        }
        //Bloco finally se a variável in do Scanner for diferente de nulo eu fecho o scanner.
        finally {
            if (in != null){
                in.close();
            }
        }
    }
}
