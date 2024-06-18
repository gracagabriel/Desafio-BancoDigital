public class Main {
    public static void main(String[] args) {
        Cliente ronaldo = new Cliente();
        ronaldo.setNome("Ronaldo");

        Conta cc = new ContaCorrente(ronaldo);
        Conta cp = new ContaPoupanca(ronaldo);

        cc.depositar(50);
        cc.transferir(25, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
