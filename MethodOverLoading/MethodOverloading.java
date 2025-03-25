package MethodOverLoading;

public class MethodOverloading {
	public static void main(String[] args) {
		add(10,20,30);
		add(10,20);
		add(10,20,30,40);
	}
	public static void add(int a,int b) {
		System.out.println("first");
		System.out.println(a+b);
		
	}
	public static void add(int a,int b,int c,int d) {
		System.out.println("second");
		System.out.println(a+b+c+d);
		
	}
	public static void add(byte a,byte b) {
		System.out.println("third");
		System.out.println(a+b);
	}
	public static void add(int a,int b,float c) {
		System.out.println(a+b+c);
		System.out.println("fourth");
	}

}
