package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {
    public static void main(String[] args) {
        // Define o padrão de ponto decimal como americano (ex: 45.0 em vez de 45,0)
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Instanciação do objeto Student
        Student student = new Student();

        // Entrada de dados com orientações ao usuário
        System.out.print("Nome do aluno: ");
        student.name = sc.nextLine();
        
        System.out.print("Digite as três notas: ");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println();
        // Exibe a nota final com duas casas decimais
        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        // Lógica de verificação de aprovação
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            // Exibe quanto faltou para o mínimo de 60
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }

        sc.close(); // Fecha o recurso Scanner
    }
}