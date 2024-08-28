
public class Conta {

    private String numeroConta;
    private String nomeCliente;
    private double saldo;


    public Conta(String numeroConta, String nomeCliente, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("O depósito de " + valor + " Foi realizado com sucesso.");
        } else {
            System.out.println("Depósito Invalido, valor deve ser maior que 0.");
        }
    }


    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Se fudeu você está liso.");
            }

        }
    }


    public double getSaldo() {
        return saldo;
    }


    public String obterInformacoes() {
        return "Número da Conta: " + numeroConta +
                ", Nome do Cliente: " + nomeCliente +
                ", Saldo Atual: " + saldo;
    }
}
