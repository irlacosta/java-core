import com.exemplo.playground.MinhaCalculadora;

import java.util.Scanner;

public class MinhaPrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Bem-vindo a Calculadora");
        System.out.println("Escolha a operação:");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        Scanner scanner = new Scanner(System.in);
        Integer operacao = scanner.nextInt();

        if (operacao == 1) {
            System.out.println("Operação SOMA escolhida");
        }else if (operacao == 2) {
            System.out.println("Operação SUBTRAÇÃO escolhida");
        }else {
            System.out.println("Operação não existe");
        }


//        System.out.println("Informe um número: ");
//        Scanner scannerFirstNumber = new Scanner(System.in);
//        scannerFirstNumber.nextLine();
//
//        System.out.println("Informe outro número: ");
//        Scanner scannerSecondNumber = new Scanner(System.in);
//        scannerSecondNumber.nextLine();
    }

}
