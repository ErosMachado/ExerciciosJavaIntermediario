package ExerciciosAula11;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Digite a escala da temperatura (C, F ou K): ");
        char escalaInicial = scanner.next().toUpperCase().charAt(0);

        converterTemperatura(temperatura, escalaInicial);

        scanner.close();
    }

    public static void converterTemperatura(double temperatura, char escala) {
        double celsius, fahrenheit, kelvin;

        switch (escala) {
            case 'C': // Celsius
                celsius = temperatura;
                fahrenheit = (temperatura * 9/5) + 32;
                kelvin = temperatura + 273.15;
                break;
            case 'F': // Fahrenheit
                celsius = (temperatura - 32) * 5/9;
                fahrenheit = temperatura;
                kelvin = celsius + 273.15;
                break;
            case 'K': // Kelvin
                celsius = temperatura - 273.15;
                fahrenheit = (celsius * 9/5) + 32;
                kelvin = temperatura;
                break;
            default:
                System.out.println("Erro: Escala inválida.");
                return;
        }

        System.out.println("Temperatura em Celsius: " + celsius + "°C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "°F");
        System.out.println("Temperatura em Kelvin: " + kelvin + "K");

        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Qual escala deseja retornar (C, F, K)? ");
			char escalaRetorno = scanner.next().toUpperCase().charAt(0);

			switch (escalaRetorno) {
			    case 'C':
			        System.out.println("Temperatura retornada: " + celsius + "°C");
			        break;
			    case 'F':
			        System.out.println("Temperatura retornada: " + fahrenheit + "°F");
			        break;
			    case 'K':
			        System.out.println("Temperatura retornada: " + kelvin + "K");
			        break;
			    default:
			        System.out.println("Erro: Escala inválida.");
			}
		}
    }
}
