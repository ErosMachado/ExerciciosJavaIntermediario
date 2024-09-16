package ExerciciosAula09;

import java.util.Scanner;

public class QExercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas da matriz A e B:");
        int linha = sc.nextInt();

        System.out.println("Digite o número de colunas da matriz A e B:");
        int coluna = sc.nextInt();

        int[][] matrizA = new int[linha][coluna];
        int[][] matrizB = new int[linha][coluna];
        int[][] matrizSoma = new int[linha][coluna];

        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                matrizA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("B[%d][%d] = ", i, j);
                matrizB[i][j] = sc.nextInt();
            }
        }

        // Calculando a soma das matrizes A e B e armazenando na matrizSoma
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Exibindo a matriz resultante
        System.out.println("Matriz Soma (A + B):");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
