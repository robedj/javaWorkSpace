public class FluxoComErros {

//Exemplo de execucao da exceção
    public static void main(String[] args) {
        System.out.println("Inicio da main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) { //Tratamento nao necessita throws
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim da main");
    }

    public static void metodo1() throws MinhaExcecao {
        System.out.println("inicio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    }
//exige que coloca na assinatura do metodo
    public static void metodo2() throws MinhaExcecao {
        System.out.println("chamando metodo 2");
        throw new MinhaExcecao("deu muito errado");
        //System.out.println("fim do metodo 2");
    }
}
