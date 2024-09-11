package ExerciciosAula10;

public class Exercicio5 {

    static void temperaturasVariadas(double valor, char escala) {
        double celsius, fahrenheit, kelvin;

        switch (escala) {
            case 'C':
                // Convers�o de Celsius para Fahrenheit e Kelvin
                celsius = valor;
                fahrenheit = (celsius * 9 / 5) + 32;
                kelvin = celsius + 273.15;
                break;
            case 'F':
                // Convers�o de Fahrenheit para Celsius e Kelvin
                fahrenheit = valor;
                celsius = (fahrenheit - 32) * 5 / 9;
                kelvin = celsius + 273.15;
                break;
            case 'K':
                // Convers�o de Kelvin para Celsius e Fahrenheit
                kelvin = valor;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9 / 5) + 32;
                break;
            default:
                System.out.println("Escala inv�lida. Use 'C', 'F' ou 'K'.");
                return;
        }

        
        System.out.printf("Temperatura em Celsius: %.2f�C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f�F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2fK%n", kelvin);
    }

    public static void main(String[] args) {
        temperaturasVariadas(30, 'F');  
    }
}
