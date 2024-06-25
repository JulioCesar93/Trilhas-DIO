
public class Menu {

    public static void main(String[] args) {

        Cliente julio = new Cliente();
	    julio.setNome("Julio Cesar");

    Conta cc = new ContaCorrente(julio);
    Conta poupanca = new ContaPoupanca(julio);

    cc.depositar(100);
    poupanca.depositar(330);
    cc.transferir(100, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();

    }
}