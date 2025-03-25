/*package Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count=0;
        while(num!=0) {
        	count++;
        	num/=10;
        }
        System.out.println(count);
        sc.close();
    }
}*/


package Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int original=num;
        int sum=0;
        while(num!=0) {
        	int remainder=num%10;
        	sum+=(remainder*remainder*remainder);
        	num=num/10;
        
        }
        if(sum==original) {
        	System.out.println("The number is armstrong");
        }else {
        	System.out.println("The number is not armstrong");
        }
        sc.close();
     }
}