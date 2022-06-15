package revisaoProva.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Posto {
    private int capacidadeMaxVeiculos;
    List<Veiculo> filaVeiculos = new ArrayList<>();
    private double precoGasolina;
    private double precoEtanol;

    public Posto(int capacidadeMaxVeiculos, double precoGasolina, double precoEtanol) {
        this.capacidadeMaxVeiculos = capacidadeMaxVeiculos;
        this.precoGasolina = precoGasolina;
        this.precoEtanol = precoEtanol;
    }

    public int getCapacidadeMaxVeiculos() {
        return capacidadeMaxVeiculos;
    }

    public void setCapacidadeMaxVeiculos(int capacidadeMaxVeiculos) {
        this.capacidadeMaxVeiculos = capacidadeMaxVeiculos;
    }

    public List<Veiculo> getFilaVeiculos() {
        return filaVeiculos;
    }

    public void setFilaVeiculos(List<Veiculo> filaVeiculos) {
        this.filaVeiculos = filaVeiculos;
    }

    public double getPrecoGasolina() {
        return precoGasolina;
    }

    public void setPrecoGasolina(double precoGasolina) {
        this.precoGasolina = precoGasolina;
    }

    public double getPrecoEtanol() {
        return precoEtanol;
    }

    public void setPrecoEtanol(double precoEtanol) {
        this.precoEtanol = precoEtanol;
    }

    public void adicionarVeiculo(Veiculo v) {
        if (estaCheio()) {
            System.out.println("O posto está cheio!");
        } else {
            filaVeiculos.add(v);
        }
    }

    public void abastecer(Veiculo v, int litros, String tipoCombustivel) {
        int capacidadeAtual = v.getCapacidadeAtualTanque();
        int capacidadeMaxima = v.getCapacidadeMaxTanque();
        int tanqueAbastecido = capacidadeAtual + litros;

        if (tanqueAbastecido < capacidadeMaxima) {

            if (tanqueAbastecido <= capacidadeMaxima) {
                v.setCapacidadeAtualTanque(tanqueAbastecido);
                filaVeiculos.remove(v);
            } else {
                v.setCapacidadeMaxTanque(capacidadeMaxima);
                filaVeiculos.remove(v);
            }

            int qtdAbastecida = v.getCapacidadeAtualTanque() - capacidadeAtual;

            System.out.printf("Tipo de combustivel %s ", tipoCombustivel);

            double valorPagar = calcularConta(qtdAbastecida,tipoCombustivel);
            System.out.printf("Valor a pagar: R$ %.2f\n ", valorPagar);


        } else {
            System.out.println("O tanque já está cheio!");
        }
    }

    public boolean estaCheio() {
        return filaVeiculos.size() == this.capacidadeMaxVeiculos ? true : false;
    }

    public double calcularConta(int litros, String tipoCombustivel){
            double contaFinal = 0d;

            if(tipoCombustivel.equals("Gasolina")){
                contaFinal = litros * this.precoGasolina;
            }
            else if (tipoCombustivel.equals("Etanol")){
                contaFinal = litros * this.precoEtanol;
            }
            return contaFinal;
    }

    @Override
    public String toString() {
        return "Posto{" +
                "capacidadeMaxVeiculos=" + capacidadeMaxVeiculos +
                ", filaVeiculos=" + filaVeiculos +
                ", precoGasolina=" + precoGasolina +
                ", precoEtanol=" + precoEtanol +
                '}';
    }
}
