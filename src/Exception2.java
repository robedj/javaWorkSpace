public class Exception2 {

//Exemplo de execucao da exceção
    public static void main(String[] args) {
        System.out.println("Inicio da main");
        metodo1();
        System.out.println("Fim da main");
    }

    public static void metodo1() {
        System.out.println("inicio do metodo 1");
        try {
            metodo2();
        } catch(ArithmeticException ex) {
            System.out.println("Arithmetic Exception");
        }
        System.out.println("Fim do metodo 1");
    }

    public static void metodo2() {
        System.out.println("inicio do metodo 2");
        for(int i = 1; i <=5; i++) {
            System.out.println(i);
            int a = i / 0;

        }
        System.out.println("fim do metodo2");
    }
}