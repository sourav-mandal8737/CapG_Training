package ExceptionHandling;
import java.util.*;
public class Finally {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		try {
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println(x/y);
			sc.close();
		}
		catch(Exception e){
			System.out.println("Exception handled");
		}
		finally {
			sc.close();
			System.out.println("Finally block");
		}
		
		
		try(Scanner scan=new Scanner(System.in)){
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println(x/y);
		}
	}

}
