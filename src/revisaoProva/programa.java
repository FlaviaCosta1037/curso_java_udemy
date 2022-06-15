package revisaoProva;

import revisaoProva.Entidades.Carro;
import revisaoProva.Entidades.Moto;
import revisaoProva.Entidades.Posto;
import revisaoProva.Entidades.Veiculo;

import java.util.*;

public class programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);


        Posto posto = new Posto(5,7.90,7.50);

        Moto moto1 = new Moto(25,10);
        Moto moto2 = new Moto(20,8);
        Carro carro = new Carro(42,10);

        posto.adicionarVeiculo(moto1);
        posto.adicionarVeiculo(moto2);
        posto.adicionarVeiculo(carro);

        List<Veiculo> listaVeiculos = posto.getFilaVeiculos();
        for(Veiculo lista : listaVeiculos){
        }
        System.out.println("Veiculos enfileirados " +  listaVeiculos.size());

        for(int i = listaVeiculos.size()-1; i >=0 ; i--){
            System.out.println("Informe o tipo de combustivel do veiculo: Gasolina / Etanol ");
            String tipo = in.nextLine();
            System.out.println("Informe a quantidade de litros do veiculo : ");
            int qtdLitros = in.nextInt();
            in.nextLine();

            posto.abastecer(listaVeiculos.get(i),qtdLitros,tipo);

        }
    }
}
