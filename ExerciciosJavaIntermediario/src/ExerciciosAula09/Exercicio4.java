package ExerciciosAula09;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite a quantidade de alunos: ");
        int n = scanner.nextInt();
        
        
        double[] notas = new double[n];
        double soma = 0;
        
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i]; 
        }
        
      
        double media = soma / n;
        System.out.printf("A média da turma é: %.2f\n", media);
        
        int acimaDaMedia = 0;
        int abaixoDaMedia = 0;
        int igualAMedia = 0;
        
      
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                acimaDaMedia++;
            } else if (notas[i] < media) {
                abaixoDaMedia++;
            } else {
                igualAMedia++;
            }
        }
        
        
        System.out.println("Notas acima da média: " + acimaDaMedia);
        System.out.println("Notas abaixo da média: " + abaixoDaMedia);
        System.out.println("Notas iguais à média: " + igualAMedia);
        
        scanner.close();
	}
}
