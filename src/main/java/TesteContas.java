public class TesteContas {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(2121, 2121);
        contaCorrente.deposita(1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2121, 2122);
        contaPoupanca.deposita(2000);
        Cliente cliente = new Cliente();
        contaCorrente.tranfere(200, contaPoupanca);
        System.out.print(contaCorrente.getSaldo() + "\n");
        System.out.print(contaPoupanca.getSaldo());

    }

}
