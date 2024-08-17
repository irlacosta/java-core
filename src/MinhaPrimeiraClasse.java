import com.exemplo.playground.UserInput;
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
            MinhaCalculadora minhaCalculadora = new MinhaCalculadora();

            if (operacao == 1) {
                System.out.println("SOMA");
                UserInput userInput = readValues();
                Integer result = minhaCalculadora.sum(userInput.firstNumber, userInput.secondNumber);
                System.out.println("Resultado: " + result);
            } else if (operacao == 2) {
                System.out.println("SUBTRAÇÃO");
                UserInput userInput = readValues();
                Integer result = minhaCalculadora.subtract(userInput.firstNumber, userInput.secondNumber);
                System.out.println("Resultado: " + result);
            } else {
                System.out.println("Operação Inválida");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Operação Inválida");
            System.out.println("Digite uma opcao válida.");
        }
    }

    public static UserInput readValues() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe um número: ");
        Integer firstNumber = scn.nextInt();
        System.out.println("Informe outro número: ");
        Integer secondNumber = scn.nextInt();
        UserInput userInput = new UserInput(firstNumber, secondNumber);
        return userInput;
    }
}
