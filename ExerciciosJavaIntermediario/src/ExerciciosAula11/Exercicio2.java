package ExerciciosAula11;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        String resultado = verificarVoto(idade);

        System.out.println("Para essa idade, o voto é: " + resultado);

        scanner.close();
    }

    public static String verificarVoto(int idade) {
        if (idade < 16) {
            return "Proibido";
        } else if (idade >= 18 && idade <= 70) {
            return "Obrigatório";
        } else {
            return "Opcional";
        }
    }
}
