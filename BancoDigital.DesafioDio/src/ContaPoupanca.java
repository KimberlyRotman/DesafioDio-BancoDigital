public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void exibirSaldo() {
        System.out.println("== conta poupanca ==");
        super.exibirSaldo();
    }

    
}
