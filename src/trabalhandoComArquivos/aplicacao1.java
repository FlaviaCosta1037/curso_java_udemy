package trabalhandoComArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class aplicacao1 {
    public static void main(String[] args) {
        //Criada uma instancia da classe File
        File file = new File("C:\\Users\\FlaviaCO\\IdeaProjects\\curso_java_udemy\\in.txt");
        Scanner in = null;
        //Criado um bloco try para tratar a excecao do tipo IOException
        try {
            in = new Scanner(file);
            while (in.hasNextLine()) { //Laço para verificar se existe proxima linha no arquivo
                System.out.println(in.hasNextLine());
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        //Fechamento do recurso scanner no bloco finally
        finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
