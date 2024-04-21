public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);

        try {
            conta.depositar(800.0);
            conta.sacar(250.0);
            conta.sacar(2000.0);  // Tentativa de saque com valor superior ao saldo
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
