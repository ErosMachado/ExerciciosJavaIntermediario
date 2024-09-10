package ExerciciosAula09;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num=0, i, soma=0;
			
			System.out.println("Digite um número inteiro: ");
			int n = sc.nextInt();
			
			int[] vetorCriado = new int[n];
			for (i=0; i<n; i++) {
				System.out.println("Digite o "+(i+1)+"º valor: ");
				num = sc.nextInt();
				vetorCriado[i] = num;
				soma = soma + num;
			}
			
			System.out.println("A soma dos valores no vetor é: "+soma);
			
			sc.close();
		}
	}
}
