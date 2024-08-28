public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta("0000.00", "Weverton Thiago Neves Nogueira", 0.00);

        System.out.println(conta1.obterInformacoes());

        //SIMULAÇÃO DE DEPOSITOS
        conta1.depositar(500.00);
        System.out.println("Saldo após o Ultimo depósito: " + conta1.getSaldo());

        conta1.depositar(0.00);
        System.out.println("Saldo após o Ultimo depósito: " + conta1.getSaldo());




        // SIMULAÇÃO DE SAQUES
        // COM DINHEIRO NA CONTA
        conta1.sacar(100.00);
        System.out.println("Saldo Atual " + conta1.getSaldo());
        // VALOR ACIMA DOQUE A NA CONTA
        conta1.sacar(900.00);

        System.out.println(conta1.obterInformacoes());
    }
}
