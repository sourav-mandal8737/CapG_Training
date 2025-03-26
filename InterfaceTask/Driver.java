package InterfaceTask;

public class Driver {

	 public static void main(String[] args) {
	     Bike bike = new Bike("B123", "Yamaha", "R15", 50.0, true, true);
	     Car car = new Car("C456", "Toyota", "Corolla", 100.0, true, 4);

	     System.out.println("Bike Details:");
	     bike.displayDetails();
	     bike.rentVehicle();

	     System.out.println("\nCar Details:");
	     car.displayDetails();
	     car.rentVehicle();
	 }
	}