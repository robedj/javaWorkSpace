public class TestaSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 300);

        conta.deposita(200);
        try {
            conta.saca(210);
        } catch(SaldoInsuficienteException ex){
            System.out.println(ex.getMessage()); //Execucao com tratamento
        }

        System.out.println("Saldo atual: " +conta.getSaldo());
    }
}
