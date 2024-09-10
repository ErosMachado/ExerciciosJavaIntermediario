package ExerciciosAula10;

public class Exercicio4 {
	
	static void calculadora(double num1, double num2, char oper) {
		
		double res=0; 

		switch (oper) { 
		
		case '+':  
		res = num1 + num2; 
		break;
		
		case '-':  
		res = num1 - num2; 
		break; 

		case '*':  
		res = num1 * num2; 
		break;
		
		case '/':   
		res = num1 / num2; 
		break; 

		default:  
		System.out.println("Operação inválida.");  
		return; 
		} 

		System.out.println("O resultado é: " + res); 
		}

	public static void main(String[] args) {
		calculadora(12, 1, '/');
	}
}
