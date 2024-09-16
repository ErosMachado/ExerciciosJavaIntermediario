package ExerciciosAula09;
public class Exercicio9 {

	public static void main(String[] args) {
		int [][] matrizMinhaQueridaMatriz = new int[3][4];
		int num = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				matrizMinhaQueridaMatriz[i][j] = num;
				num++;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrizMinhaQueridaMatriz[i][j] + "\t");
			}
		System.out.println(""); 
			}

	}//fim
}//fim
