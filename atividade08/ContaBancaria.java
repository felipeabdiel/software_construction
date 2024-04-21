public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + this.saldo);
    }

    public void sacar(double valor) throws ExcecaoSaldo {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        if (valor > saldo) {
            throw new ExcecaoSaldo
    ("Saldo insuficiente para saque de R$" + valor);
        }

        this.saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
