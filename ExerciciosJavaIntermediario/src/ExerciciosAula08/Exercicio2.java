package ExerciciosAula08;
import java.util.Calendar;
public class Exercicio2 {
	public static void main(String[] args) {		
		Calendar c = Calendar.getInstance();
		int diaSemana = c.get(Calendar.DAY_OF_WEEK);
		if(diaSemana ==3) {
			System.out.println("Bora para feira? Hoje terá feira na rua!");
		}else {
			System.out.println("Hoje num tem feira! :( ");
		}	
	}
}
