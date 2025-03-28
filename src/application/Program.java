package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Please inform student data: ");
        Student estudante = new Student();

        System.out.print("Name:");
        estudante.name = sc.nextLine();

        System.out.print("Grades:");
        estudante.notas = new double[]{sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};

        System.out.println();
        double grade = estudante.finalGrade();
        System.out.printf("FINAL GRADE = %.2f%n", grade);
        System.out.println(estudante);
        if (grade <= 60.00){
            System.out.printf("MISSING %.2f POINTS%n", estudante.missingPoints());
        }
        sc.close();
    }
}
