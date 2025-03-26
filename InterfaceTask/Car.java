package InterfaceTask;

public class Car extends Vehicle {
	 private int numberOfDoors;

	 public Car(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable, int numberOfDoors) {
	     super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);
	     this.numberOfDoors = numberOfDoors;
	 }

	 public void displayDetails() {
	     super.displayDetails();
	     System.out.println("Number of Doors: " + numberOfDoors);
	 }
	}