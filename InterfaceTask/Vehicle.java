package InterfaceTask;

public class Vehicle {
private String vehicleNumber;
private String brand;
private String model;
private double rentalPricePerDay;
private boolean isAvailable;

public Vehicle(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable) {
   this.vehicleNumber = vehicleNumber;
   this.brand = brand;
   this.model = model;
   this.rentalPricePerDay = rentalPricePerDay;
   this.isAvailable = isAvailable;
}

public void displayDetails() {
   System.out.println("Vehicle Number: " + vehicleNumber);
   System.out.println("Brand: " + brand);
   System.out.println("Model: " + model);
   System.out.println("Rental Price per Day: " + rentalPricePerDay);
   System.out.println("Available: " + isAvailable);
}

public void rentVehicle() {
   if (isAvailable) {
       isAvailable = false;
       System.out.println("Vehicle rented successfully.");
   } else {
       System.out.println("Vehicle is not available.");
   }
}
}