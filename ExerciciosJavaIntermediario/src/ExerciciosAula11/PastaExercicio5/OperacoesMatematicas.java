package ExerciciosAula11.PastaExercicio5;

public class OperacoesMatematicas {

    public double realizarOperacao(char operacao, double num1, double num2) {
        switch (operacao) {
            case '+':
                return somar(num1, num2);
            case '-':
                return subtrair(num1, num2);
            case '*':
                return multiplicar(num1, num2);
            case '/':
                return dividir(num1, num2);
            default:
                System.out.println("Operação inválida!");
                return 0;
        }
    }

    private double somar(double num1, double num2) {
        return num1 + num2;
    }

    private double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    private double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    private double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Divisão por zero!");
            return 0;
        }
    }
}
