package Conditional_Statements;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        /*if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("The number is positive even.");
            } else {
                System.out.println("The number is positive odd.");
            }
        } else if (num < 0) {
            if (num % 2 == 0) {
                System.out.println("The number is negative even.");
            } else {
                System.out.println("The number is negative odd.");
            }
        }*/  
        if(num>0 && num%2==0) {
        	System.out.println("The number is positive even");
        }
        else if(num<0 && num%2==0) {
        	System.out.println("The number id negative even");
        }
        else if(num>0 && num%2!=0) {
        	System.out.println("The number is positive odd");
        }
        else if(num<0 && num%2!=0) {
        	System.out.println("The number is negative odd");
        }
        scanner.close();
    }
}
