import com.exemplo.playground.MinhaCalculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MinhaPrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Bem-vindo a Calculadora");
        System.out.println("Escolha a operação:");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        Scanner scanner = new Scanner(System.in);
        Integer operacao = 0;

        try {
            operacao = scanner.nextInt();

            if (operacao == 1) {
                System.out.println("Operação SOMA escolhida");
                System.out.println("Informe um número: ");
                Integer firstNumber = scanner.nextInt();
                System.out.println("Informe outro número: ");
                Integer secondNumber = scanner.nextInt();
                Integer resultado = MinhaCalculadora.somar(firstNumber,secondNumber);
                System.out.println("Resultado: " + resultado);
            } else if (operacao == 2) {
                System.out.println("Operação SUBTRAÇÃO escolhida");
                System.out.println("Informe um número: ");
                Integer firstNumber = scanner.nextInt();
                System.out.println("Informe outro número: ");
                Integer secondNumber = scanner.nextInt();
                Integer resultado = MinhaCalculadora.subtrair(firstNumber,secondNumber);
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Operação não existe");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Operação não existe");
        }


//
//        System.out.println("Informe outro número: ");
//        Scanner scannerSecondNumber = new Scanner(System.in);
//        scannerSecondNumber.nextLine();
    }

}
