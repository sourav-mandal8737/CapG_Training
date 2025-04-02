package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPropagation {
	/*public static void main(String[] args) {
		alpha();

	}
	public static void alpha(){
		System.out.println("This is alpha");
		beta();
	}
	public static void beta(){
		System.out.println("This is beta");
		gamma();
	}
	public static void gamma(){
		System.out.println("This is gamma");
		try {
		     System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception handled");
		}
		System.out.println("end of gamma");*/
	
	
	
	
	
	
		public static void main(String[] args) {
	     Scanner scan=new Scanner(System.in);
	     try{
	    	 System.out.println("Enter two number");
	     int x=scan.nextInt();
	     int y=scan.nextInt();
	     System.out.println(x/y);
	     }
	     catch(ArithmeticException e) {
	    	 System.out.println("ArithmeticException handled");
	    	 
	     }
	     catch(InputMismatchException e) {
	    	 System.out.println("InputMismatchException handled");
	     }
	     try {
	    	 scan.nextLine();
	    	 int[] arr= {1,2,3,4,5};
	         System.out.println("Enter the index to access");
	         System.out.println(arr[scan.nextInt()]);
	     }
	     catch(ArrayIndexOutOfBoundsException e) {
	    	 System.out.println("ArrayIndexOutOfBoundsException handled");
	    	 
	     }
	     try {
	         Class.forName("Demo");
	     }
	     catch(Exception e) {
	    	 System.out.println("ClassNotFoundException handled");
	     }
	     scan.close();
	     }

}
