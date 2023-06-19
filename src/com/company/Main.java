package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Equation equation = new Equation();
        System.out.print("Enter a math equation: ");
        String eq = scanner.nextLine();

        if (equation.validateBrackets(eq) && equation.validateExpression(eq)) {
            System.out.println("Equation is valid");
            int countNumber = equation.countNumbers(eq);
            System.out.println("Number of digits: " + countNumber);
        } else {
            System.out.println("Equation is not valid");
        }
        scanner.close();
    }
}
