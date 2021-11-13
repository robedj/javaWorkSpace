public class Fluxo {

//Exemplo de execucao da exceção
    public static void main(String[] args) {
        System.out.println("Inicio da main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim da main");
    }

    public static void metodo1() {
        System.out.println("inicio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    }

    public static void metodo2() {
        System.out.println("inicio do metodo 2");
        ArithmeticException exception = new ArithmeticException("erro");
        throw exception;
       // System.out.println("fim do metodo2");
    }
}
