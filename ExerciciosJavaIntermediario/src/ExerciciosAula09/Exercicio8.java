package ExerciciosAula09; //ainda n�o completo 11/09

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		int i =0;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um n�mero inteiro positivo: ");
			int n = scan.nextInt();
			char[] caractereNovo =  new char[n];
			
			
			for(i=0; i<n; i++) {
				System.out.println("Digite um caractere qualquer: ");
				caractereNovo[i]  = scan.nextLine().charAt(i); //essa linha est� dando erro
			}
			
			scan.close();
		}
	}
}
