public abstract class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero){
        Conta.total ++;
        //System.out.println("O total de contas é: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
       // System.out.println(this.agencia);
    }

    public void deposita(double valor){
        this.saldo += valor;

    }
    public boolean saca(double valor){
        if(saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;

    }
    public boolean tranfere (double valor, Conta destino){
        if(this.saca(valor)){
            destino.deposita(valor);
            return true;
        }
        return false;

    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }


    public int getAgencia() {
        return this.agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}