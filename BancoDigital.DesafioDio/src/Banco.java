import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> cl;

    public Banco() {
            this.cl = new ArrayList<>();
        }

    public void criarConta(String nome, int idade){
        Cliente cliente = new Cliente(nome, idade);
        cl.add(new Conta(cliente));
    }


    public static void main(String[] args) {

        Cliente cli1 = new Cliente("Marcos", 15);
        Conta cc = new ContaCorrente(cli1);
        Conta poupanca = new ContaPoupanca(cli1);

        cc.depositar(50.0);
        cc.exibirSaldo();

        poupanca.depositar(60.0);
        poupanca.exibirSaldo();

        cc.transferir(7.0, poupanca);
        poupanca.exibirSaldo();
        cc.exibirSaldo();
    }
    
}
