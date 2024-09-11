package ExerciciosAula09;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[100]; 
        int count = 0;
        
        while (true) {
            System.out.print("Digite um nome (ou pressione Enter para finalizar): ");
            String nome = scan.nextLine();
            
            
            if (nome.length() == 0) {
                break; 
            }
            
            nomes[count] = nome; 
            count++; 
        }
        
        System.out.println("\nNomes na ordem inversa:");
        for (int i = count - 1; i >= 0; i--) {
            System.out.println(nomes[i]); 
        }
        
        scan.close();
    }
}
