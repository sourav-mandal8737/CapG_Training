package Loops;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("The number is not prime");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("The number is not prime");
                    sc.close();
                    return; 
                }
            }
            System.out.println("The number is prime");
        }

        sc.close();
    }
}
