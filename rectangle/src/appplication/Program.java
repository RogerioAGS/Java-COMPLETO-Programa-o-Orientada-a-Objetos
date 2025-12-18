package appplication;

import entities.Rectangle;

public class Program {
	public static void main(String[] args) {
		        // Cria um novo objeto Rectangle com width=10.0 e height=5.0
		        Rectangle r1 = new Rectangle(10.0, 5.0);

		        System.out.println("--- Dados do Retângulo r1 (10.0 x 5.0) ---");
		        
		        // Chamando os métodos públicos para obter os cálculos
		        System.out.println("Área: " + r1.Area());         // Saída: 50.0
		        System.out.println("Perímetro: " + r1.Perimeter()); // Saída: 30.0
		        System.out.println("Diagonal: " + r1.Diagonal());   // Saída: 11.1803...
		    }
		}
}
