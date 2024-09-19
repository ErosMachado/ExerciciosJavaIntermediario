package ExerciciosAula11;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = scanner.nextDouble();

        double area = calcularArea(largura, comprimento);

        System.out.println("A área do terreno é: " + area + " metros quadrados");

        scanner.close();
    }
    public static double calcularArea(double largura, double comprimento) {
        return largura * comprimento;
    }
}
