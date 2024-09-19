package ExerciciosAula11;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo n�mero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o operador matem�tico (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado = calcular(num1, num2, operador);

        System.out.println("O resultado da opera��o �: " + resultado);

        scanner.close();
    }

    public static double calcular(double num1, double num2, char operador) {
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Erro: Divis�o por zero n�o � permitida.");
                    return 0; 
                }
            default:
                System.out.println("Erro: Operador inv�lido.");
                return 0;
        }
    }
}
