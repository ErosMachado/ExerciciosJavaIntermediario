package ExerciciosAula11;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o operador matemático (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado = calcular(num1, num2, operador);

        System.out.println("O resultado da operação é: " + resultado);

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
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return 0; 
                }
            default:
                System.out.println("Erro: Operador inválido.");
                return 0;
        }
    }
}
