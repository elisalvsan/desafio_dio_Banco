public class ContaCorrente {

    private int agencia;
    private int numero;
    private double saldo;

    // Construtor
    public ContaCorrente(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0.0;
    }

    // Getters e Setters
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para depositar dinheiro
    public void depositar() {
    }

    // Método para transferir dinheiro
    public void transferir() {
    }

    // Método para sacar dinheiro
    public void sacar() {
    }

}
