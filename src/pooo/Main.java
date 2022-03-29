package pooo;

import poo.model.Cliente;
import poo.model.Conta;
import poo.model.ContaCorrente;
import poo.model.ContaPoupanca;

public class Main {

    private static ContaCorrente conta;

    public static void main(String[]args){
        Conta cc = new ContaCorrente();
        cc.depositar(100);

        Conta pop = new ContaPoupanca();
        cc.transferir((100), pop);

        Cliente cliente = new Cliente();

        try {
            cliente.adicionaConta(conta);
            System.out.println("Conta cadastrada com sucesso");

        } catch (Exception e) {
            System.out.println("Houve um erro:" + e.getMessage());

        }
        cc.imprimirInfo();
        pop.imprimirInfo();
        
    }
}

