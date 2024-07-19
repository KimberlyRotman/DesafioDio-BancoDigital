public class Conta {

    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    private Cliente cliente;

    public void sacar(Double valor){
        saldo = saldo - valor;
    }
    public void depositar(Double valor){
        saldo = saldo + valor;
    }
    public void transferir(Double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }


    public Conta() {
        //TODO Auto-generated constructor stub
    }
    public int getAgencia() {
        return agencia;
    }
    public int getConta() {
        return conta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirSaldo(){
        System.out.println("agecia: " + agencia);
        System.out.println("nome: " + cliente.getNome());
        System.out.println("conta: " + conta);
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
    public void criarConta(String string, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarConta'");
    }

}
