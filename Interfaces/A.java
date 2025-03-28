package Interfaces;

public interface A {
	int a=10;
	static void message() {
		System.out.println("This is Interface A");
	}
	
	default void print() {
		System.out.println("Hey");
	}

}
