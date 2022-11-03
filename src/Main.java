public class Main {

   public static void main(String[] args) {
       Cliente poppy = new Cliente();
       poppy.setNome("Poppy");

       Conta cc = new ContaCorrente(poppy);
       Conta poupanca = new ContaPoupanca(poppy);

       cc.depositar(100);
       cc.transferir(100, poupanca);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();
   }

}
