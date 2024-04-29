public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Pombo", 10000);

        System.out.println("Saldo inicial: " +conta.getSaldo()); // mostra o saldo inicial de 10000

        conta.depositar(500); // depositar 500 em cima de 10000
        System.out.println("Novo saldo: " +conta.getSaldo()); // novo saldo após depósito de 500

        conta.sacar(400); // sacar um valor
        System.out.println("Novo saldo: " +conta.getSaldo()); // novo saldo após saque

        System.out.println("Saldo final: " +conta.getSaldo()); // saldo final
    }
}
