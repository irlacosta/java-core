import com.exemplo.playground.MinhaCalculadora;

public class MinhaPrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Hello World");

        var objetoCalculadora = new MinhaCalculadora();
        var soma = objetoCalculadora.somar(4,5);
        var subtracao = MinhaCalculadora.subtrair(4,5);

        System.out.println("O somatório é: " + soma);
        //System.out.println("A subtração é: " + subtracao(4,5));
        System.out.println("A subtração é: " + MinhaCalculadora.subtrair(4,5));
    }

}
