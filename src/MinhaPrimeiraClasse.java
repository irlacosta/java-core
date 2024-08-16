public class MinhaPrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Hello World");
        var somatorio = soma(2,4);
        var subtracao = subtracao(6,1);

        System.out.println("O somatório é: " + somatorio);
        System.out.println("A subtração é: " + subtracao);
        System.out.println("Hello World");

    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }
}
