public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        }catch(ArithmeticException | NullPointerException| MinhaExcecao ex){
            String msg = ex.getMessage();
            System.out.println("Exception "+ msg);
            ex.printStackTrace();
        }
        System.out.println("Fim da main");
    }

    public static void metodo1() {

        System.out.println("ini do metodo 1");

        metodo2();

        System.out.println("fim do metodo1");

    }

    public static void metodo2() throws  MinhaExcecao {
        System.out.println("Ini metodo2");

        throw new MinhaExcecao("Deu muito errado");

        //System.out.println("fim metodo2");

    }

}
