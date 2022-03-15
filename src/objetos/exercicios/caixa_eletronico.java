package objetos.exercicios;

import objetos.entidade.Conta;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class caixa_eletronico {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Informe o numero da conta:");
        int numeroConta = in.nextInt();

        System.out.println("Informe o nome do titular da conta: ");
        String nomeTitular = in.next();

        Conta conta = new Conta(numeroConta, nomeTitular);

        int opcao;
        System.out.println("Haverá um deposito inicial? (1)sim, (2) Não");
        opcao = in.nextInt();

        Conta conta1 = new Conta(numeroConta, nomeTitular);

        Double valorDeposito = 0.0;
        if (opcao == 1) {
            System.out.println("Informe o valor do depósito: ");
            valorDeposito = in.nextDouble();
            conta1 = new Conta(numeroConta, nomeTitular, valorDeposito);

        } else if (opcao == 2) {
            valorDeposito = 0.0;
            conta1 = new Conta(numeroConta, nomeTitular, valorDeposito);
        }

        conta1.imprimir(numeroConta, nomeTitular, valorDeposito);

        System.out.println("\nDeposite um valor na conta: ");
        valorDeposito = in.nextDouble();
        conta1.deposito(valorDeposito);

        System.out.println("Conta atualizada");

        conta1.imprimir(numeroConta, nomeTitular, conta1.getValor());

        Double valorRetirada = 0.0;
        System.out.println("\nFaça uma retirada da conta: ");
        valorRetirada = in.nextDouble();
        conta1.retirada(valorRetirada);

        conta1.imprimir(numeroConta, nomeTitular, conta1.saldo());




    }
}