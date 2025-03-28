package Abstraction;

public class Driver {
	public static void main(String[] args) {
		//Vehicle v=new Vehicle();
		Vehicle v1=new Bike();
		v1.start();
		v1.message();
		Vehicle v2=new Car();
		v2.start();
		v2.message();
	}

}
