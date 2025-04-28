package Ride_Booking_System;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RideBookingSystem system = new RideBookingSystem();

        system.loadDriversFromFile();
        while (true) {
            System.out.println("\n--- Ride Booking System ---");
            System.out.println("1. Register Customer");
            System.out.println("2. Register Driver");
            System.out.println("3. Book Ride");
            System.out.println("4. Show All Drivers");
            System.out.println("5. Save Data and Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Customer ID: ");
                        String cid = scanner.nextLine();
                        System.out.print("Enter Customer Name: ");
                        String cname = scanner.nextLine();
                        Customer customer = new Customer(cid, cname);
                        system.registerCustomer(customer);
                        System.out.println("Customer registered successfully!");
                        break;
                    case 2:
                        System.out.print("Enter Driver ID: ");
                        String did = scanner.nextLine();
                        System.out.print("Enter Driver Name: ");
                        String dname = scanner.nextLine();
                        Driver driver = new Driver(did, dname);
                        system.registerDriver(driver);
                        System.out.println("Driver registered successfully!");
                        break;
                    case 3:
                        System.out.print("Enter Customer ID: ");
                        String searchId = scanner.nextLine();
                        Optional<Customer> customerOpt = system.getCustomers().stream()
                                .filter(c -> c.id.equals(searchId))
                                .findFirst();
                        if (customerOpt.isPresent()) {
                            Ride ride = system.bookRide(customerOpt.get());
                            System.out.println("Ride booked successfully! " + ride.rideDetails());
                        } else {
                            System.out.println("Customer ID not found.");
                        }
                        break;
                    case 4:
                        system.showAllDrivers();
                        break;
                    case 5:
                        system.saveDriversToFile();
                        system.saveRides();
                        System.out.println("Data saved. Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (InvalidRideException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}




















