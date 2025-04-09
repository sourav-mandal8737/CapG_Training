package StackUsingArray;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);
        
        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check if Stack is Empty");
            System.out.println("6. Exit");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to push: ");
                    int pushValue = scanner.nextInt();
                    stack.push(pushValue);
                    break;
                
                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {  
                        System.out.println("Popped value: " + poppedValue);
                    }
                    break;
                
                case 3:
                    int topValue = stack.peek();
                    if (topValue != -1) {  
                        System.out.println("Top element is: " + topValue);
                    }
                    break;
                
                case 4:
                    stack.display();
                    break;
                
                case 5:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
