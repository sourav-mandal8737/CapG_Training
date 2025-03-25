package Conditional_Statements;

import java.util.Scanner;

public class CalculatorApk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nChoose what you want to perform:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Calculator.addMenu(sc);  
                    break;

                case 2:
                    Calculator.subMenu(sc);  
                    break;

                case 3:
                    Calculator.mulMenu(sc);  
                    break;

                case 4:
                    Calculator.divMenu(sc);
                    break;

                case 5:
                    System.out.println("Exiting the calculator...");
                    sc.close();  
                    return;  

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
                    break;
            }

            System.out.print("\nDo you want to perform another operation? (yes/no): ");
            String continueChoice = sc.next();

            if (continueChoice.equalsIgnoreCase("no")) {
                System.out.println("Exiting the calculator...");
                sc.close();  
                break;  
            }
        }
    }
}
