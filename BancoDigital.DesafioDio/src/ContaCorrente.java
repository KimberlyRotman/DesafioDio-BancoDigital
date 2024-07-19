public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void exibirSaldo() {
        
        System.out.println("== conta corrente ==");
        super.exibirSaldo();
    }

    

}
