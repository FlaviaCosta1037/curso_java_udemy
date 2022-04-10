package heranca;

import heranca.entidades.Conta;
import heranca.entidades.ContaEmpresarial;
import heranca.entidades.ContaPoupanca;

import java.util.Locale;

public class programaBanco {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);

        Conta conta = new Conta(1001,"Fernanda",0.0);
        ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1002, "Roberto", 0.0, 500.0);

        //UPCASTING

        Conta conta1 = contaEmpresarial;
        Conta conta2 = new ContaEmpresarial(1003,"Flavia",0.0,100.00);
        Conta conta3 = new ContaPoupanca(1004,"Paty", 0.0, 0.10);

        //DOWNCASTING

        /*Possível*/
        ContaEmpresarial conta4 = (ContaEmpresarial)conta2;
        conta4.emprestimo(200.00);

        /*Não dá certo*/ /*Não é possível uma subclasse receber outra subclasse,porém o erro só aparece
        em tempo de execução do compilador, portanto, é importante usar o INSTANCEOF para identificar o erro*/
        //ContaEmpresarial conta5 = (ContaEmpresarial)conta3;

        if(conta3 instanceof ContaEmpresarial){
            ContaEmpresarial conta5 = (ContaEmpresarial) conta3;
            conta5.emprestimo(200.00);
        }else if(conta3 instanceof ContaPoupanca){
            ContaPoupanca conta5 = (ContaPoupanca)conta3;
            conta5.atualizarSaldo();
            System.out.println("Saldo atualizado!");
        }


    }
}
