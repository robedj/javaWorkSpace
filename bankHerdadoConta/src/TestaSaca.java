public class TestaSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 300);

        conta.deposita(200);
        conta.saca(210);
        //Sai abruptamente sem chegar no final

        System.out.println(conta.getSaldo());
    }
}
