package ExerciciosAula11.PastaExercicio5;

public class Principal {
    public static void main(String[] args) {
        OperacoesMatematicas opMat = new OperacoesMatematicas();
        
        double resultado = opMat.realizarOperacao('/', 10, 5);
        System.out.println("Resultado da operacao: " + resultado);

    }
}
