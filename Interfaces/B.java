package Interfaces;

public interface B {
	double a=30;
	
	static void message() {
		System.out.println("This is interface A");
	}
	
	default void print() {
		System.out.println("Hi");
	}

}
