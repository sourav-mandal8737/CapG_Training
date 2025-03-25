package Conditional_Statements;
import java.util.Scanner;
public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		if(sc.hasNextInt()) {
			System.out.println(sc.nextInt());
		}
		else if(sc.hasNextDouble()) {
			System.out.println(sc.nextDouble());
		}
		//else if(sc.hasNext()){
		//	System.out.println(sc.next());
		//}
		else {
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}


