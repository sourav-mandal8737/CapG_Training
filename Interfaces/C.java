package Interfaces;

public interface C extends A,B{
	default void check() {
		System.out.println(A.a);
		A.message();
		B.message();
		print();
	}
	
	//overriding print() to access A type print()
	@Override
	default void print() {
		A.super.print();
	}
	/*
	 * if we create another default method with same name as parent then the compiler does not throw any error
	 * as the new default method will be bellonging to type C and both default methods from type A and B will
	 * be shadowed.
	 * 
	 * default void print()
	 * {
	 *      System.out.println("hola");
	 * }
	 */
	
	public static void main(String[] args) {
		//check()  error, default methods cannot be accessed in static context
	}

}
