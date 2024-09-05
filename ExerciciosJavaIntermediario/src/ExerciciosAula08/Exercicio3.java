package ExerciciosAula08;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cMaius = 0, cNum = 0, cMinus=0, cBranco=0;
		
		System.out.println("Digite um texto, por favor: ");
		String text = scan.nextLine();
		
		for (int i = 0; i < text.length(); i++) {
			
			if ((text.charAt(i) >= 'A') && (text.charAt(i) <= 'Z')) {
				cMaius = cMaius + 1;
				}
			
			if((text.charAt(i) >= 'a') && (text.charAt(i) <= 'z')) {
				cMinus  =cMinus+1;
			}
			
			if((text.charAt(i) >= '0') && (text.charAt(i) <= '9')) {
				cNum  = cNum +1;
			}
			if(Character.isWhitespace(text.charAt(i))) {
				cBranco  = cBranco+1;
			}
		}
		System.out.println("O número de caracteres maiusculos são: "+ cMaius);
		System.out.println("O número de caracteres minusculos são: "+ cMinus);
		System.out.println("O número de caracteres Numéricos são: "+ cNum);
		System.out.println("O número de caracteres em branco (espaço) são: "+ cBranco);
		
		scan.close();
	}
}
