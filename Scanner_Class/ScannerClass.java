/*package Scanner_Class;

import java.util.Scanner;
//import java.util.*;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter first number: ");
	    int num1=sc.nextInt();
	    System.out.println("Enter second number: ");
	    int num2=sc.nextInt();
	    System.out.println(num1+num2);
	    System.out.println("Enter boolean");
	    System.out.println(sc.nextBoolean());
	    System.out.println("Enter byte");	  
	    System.out.println(sc.nextByte());
	    System.out.println("Enter short");
	    System.out.println(sc.nextShort());
	    System.out.println("Enter Long");
	    System.out.println(sc.nextLong());
	    System.out.println("Enter float");
	    System.out.println(sc.nextFloat());
	    
	    System.out.println("Enter name");
	    System.out.println(sc.next());   //accepts a string (single worded strings)
	    
	    System.out.println("Enter your full name");
	    System.out.println(sc.nextLine()); //accepts all characters as string(multi-worded strings)
	
	}

}*/





package Scanner_Class;

import java.util.Scanner;
//import java.util.*;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		if(sc.hasNextInt()) {
			System.out.println(sc.nextInt());
	    }else {
		    System.out.println("input mismatch");
	    }
		sc.close();
    }
}
