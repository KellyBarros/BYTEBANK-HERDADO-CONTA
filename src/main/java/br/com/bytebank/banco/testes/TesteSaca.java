package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteSaca {

    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente(2121,2121);
        cc.deposita(1000);
        // cc.saca(800);
        ContaPoupanca cp = new ContaPoupanca(2222,2222);
        try {
            cc.tranfere(1000, cp);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(cc.getSaldo() + " " + cp.getSaldo());

    }
}
