package ExerciciosAula08;
import java.util.Random;

public class Exercicio5 {

	public static void main(String[] args) {
		Random rand = new Random();
		double num=0, soma=0;
		
		for(int i=0; i<=10; i++) {
		num = rand.nextDouble(5, 51);
		System.out.println("o valor de número "+i+" escolhido é: "+num);
		soma = soma+num;
		}
		System.out.println("A soma total desses valores é "+ soma);
		
	}

}
