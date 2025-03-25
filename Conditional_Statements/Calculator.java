package Conditional_Statements;

import java.util.Scanner;

public class Calculator {

    public static void addMenu(Scanner sc) {
        System.out.println("Do you want to add using 2 or 3 variables?");
        System.out.print("Enter 2 or 3: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 2:
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();
                System.out.println("Addition result: " + (num1 + num2));
                break;

            case 3:
                System.out.print("Enter first number: ");
                double num3 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num4 = sc.nextDouble();
                System.out.print("Enter third number: ");
                double num5 = sc.nextDouble();
                System.out.println("Addition result: " + (num3 + num4 + num5));
                break;

            default:
                System.out.println("Invalid choice! Please select either 2 or 3.");
                break;
        }
    }

    public static void subMenu(Scanner sc) {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Subtraction result: " + (num1 - num2));
    }

    public static void mulMenu(Scanner sc) {
        System.out.println("Do you want to multiply using 2 or 3 variables?");
        System.out.print("Enter 2 or 3: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 2:
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();
                System.out.println("Multiplication result: " + (num1 * num2));
                break;

            case 3:
                System.out.print("Enter first number: ");
                double num3 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num4 = sc.nextDouble();
                System.out.print("Enter third number: ");
                double num5 = sc.nextDouble();
                System.out.println("Multiplication result: " + (num3 * num4 * num5));
                break;

            default:
                System.out.println("Invalid choice! Please select either 2 or 3.");
                break;
        }
    }

    public static void divMenu(Scanner sc) {
        System.out.print("Enter numerator: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter denominator: ");
        double num2 = sc.nextDouble();

        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed!");
        } else {
            System.out.println("Division result: " + (num1 / num2));
        }
    }
}
