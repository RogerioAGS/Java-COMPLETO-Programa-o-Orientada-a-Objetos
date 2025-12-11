package appplication;


import entities.Rectangle;
import java.util.Scanner;
import java.util.Locale; 

public class Program {

    public static void main(String[] args) {

    	Locale.setDefault(Locale.US); // <--- Configuração para ponto decimal
		Scanner sc = new Scanner(System.in);
    	
		Rectangle rectangle = new Rectangle(); // <--- Construtor padrão
        
		System.out.println("Enter rectangle width and height: ");
		System.out.print("Width: ");	
		rectangle.width = sc.nextDouble(); 
		System.out.print("Height: ");
		rectangle.height = sc.nextDouble(); 
        
        // --- Chamando os métodos públicos para obter os cálculos ---
        
        // Uso de System.out.printf para formatar a saída com duas casas decimais
        System.out.printf("AREA = %.2f%n", rectangle.Area());  
        System.out.printf("PERIMETER = %.2f%n", rectangle.Perimeter()); 
        System.out.printf("DIAGONAL = %.2f%n", rectangle.Diagonal());  
        
		sc.close();
    }
}