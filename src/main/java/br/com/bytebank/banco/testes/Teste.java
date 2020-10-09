package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import sun.plugin2.gluegen.runtime.CPU;

public class Teste {

    public static void main(String[] args) {
        System.out.println("x");
        System.out.println(33);
        System.out.println(true);

        ContaCorrente cc = new ContaCorrente(22,33);
        ContaPoupanca cp = new ContaPoupanca(44,55);

        System.out.println(cc);
        System.out.println(cp);

        println();
    }

    static void println(){
    }
    static void println(int a){
    }
    static void println(boolean valor){
    }
    static void println(Object conta){
    }
}
