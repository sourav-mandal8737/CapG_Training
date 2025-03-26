package Interface;

public class ChildClass extends SuperClass {
	double a=40.5;
	static double b=59.6;
	public void print() {
		System.out.println(super.a);
		System.out.println(a);
		
		System.out.println(SuperClass.b);
		System.out.println(b);
	}

}
