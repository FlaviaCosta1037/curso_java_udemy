package abstratos;

import abstratos.Entidades.Circulo;
import abstratos.Entidades.Enum.Cor;
import abstratos.Entidades.Forma;
import abstratos.Entidades.Retangulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class aplicacao_Formas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        List<Forma> lista = new ArrayList<>();

        System.out.print("Informe o numero de formas: ");
        int qtd = in.nextInt();

        for(int i = 1; i <= qtd; i++){
            System.out.println("Forma # " + i + "data:");
            System.out.print("Retangulo ou Circulo: r/c ");
            char tipoForma = in.next().charAt(0);

            System.out.print("Informe a cor: PRETO/AZUL/VERMELHO \n");
            Cor cor = Cor.valueOf(in.next());

            if(tipoForma == 'r'){
                System.out.print("Informe a largura: \n");
                double altura = in.nextDouble();
                System.out.print("Informe a altura: \n");
                double largura = in.nextDouble();
                lista.add(new Retangulo(cor,altura,largura));
            }else {
                System.out.print("Informe o raio: \n");
                double raio = in.nextDouble();
                lista.add(new Circulo(cor,raio));
            }
        }
        System.out.println();
        System.out.println("Areas");
        for (Forma forma:lista) {
            System.out.println(String.format("%.2f",forma.area()));
        }
    }
}
