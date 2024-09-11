package ExerciciosAula10;

public class Exercicio5 {

    static void temperaturasVariadas(double valor, char escala) {
        double celsius, fahrenheit, kelvin;

        switch (escala) {
            case 'C':
                // Conversão de Celsius para Fahrenheit e Kelvin
                celsius = valor;
                fahrenheit = (celsius * 9 / 5) + 32;
                kelvin = celsius + 273.15;
                break;
            case 'F':
                // Conversão de Fahrenheit para Celsius e Kelvin
                fahrenheit = valor;
                celsius = (fahrenheit - 32) * 5 / 9;
                kelvin = celsius + 273.15;
                break;
            case 'K':
                // Conversão de Kelvin para Celsius e Fahrenheit
                kelvin = valor;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9 / 5) + 32;
                break;
            default:
                System.out.println("Escala inválida. Use 'C', 'F' ou 'K'.");
                return;
        }

        
        System.out.printf("Temperatura em Celsius: %.2f°C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2fK%n", kelvin);
    }

    public static void main(String[] args) {
        temperaturasVariadas(30, 'F');  
    }
}
