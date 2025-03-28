package Abstraction;

public class Car extends Vehicle {
	
	@Override
	public void start() {
		System.out.println("Electric Engine start");
	}
	@Override
	public void message() {
		System.out.println("Have a good day");
	}
	

}
