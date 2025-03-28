package Abstraction;

public class Bike  extends Vehicle{
	@Override
	public void start() {
		System.out.println("Bike starts");
	}
	
	@Override
	public void message() {
		System.out.println("Have a safe ride");
	}

}
