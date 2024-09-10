package ExerciciosAula10;

public class Exercicio3 {
	
	static void votoObrigatorio(int idade) {
		if(((idade)<18 && (idade)>=16) || (idade)>70) { 
			System.out.println("Voto opcional"); 
			} 
				else if(((idade)>=18)&&(idade<=70)) { 
			System.out.println("Voto obrigatorio"); 
			}
				else { 
			System.out.println("Voto Proibido"); 
			} 
	}

	public static void main(String[] args) {
		votoObrigatorio(25);
	}
}
