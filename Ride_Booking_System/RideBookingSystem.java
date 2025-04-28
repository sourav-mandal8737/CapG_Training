package Ride_Booking_System;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class RideBookingSystem {
    private List<Customer> customers = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();
    private List<Ride> rides = new ArrayList<>();

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    public Ride bookRide(Customer customer) {
        Optional<Driver> driverOpt = drivers.stream()
                .filter(Driver::isAvailable)
                .findFirst();

        if (driverOpt.isPresent()) {
            Driver driver = driverOpt.get();
            driver.setAvailable(false);
            Ride ride = new Ride(customer, driver);
            rides.add(ride);
            return ride;
        } else {
            throw new InvalidRideException("No available drivers!");
        }
    }

    public void saveRides() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("rides.txt"))) {
            for (Ride ride : rides) {
                writer.write(ride.rideDetails());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving rides: " + e.getMessage());
        }
    }

    public void loadDriversFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("drivers.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    Driver driver=new Driver(parts[0], parts[1]);
                    driver.setAvailable(Boolean.parseBoolean(parts[2]));
                    registerDriver(driver);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading drivers: " + e.getMessage());
        }
    }

    public void saveDriversToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("drivers.txt"))) {
            for (Driver driver : drivers) {
                writer.write(driver.id + "," + driver.name+","+driver.isAvailable());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving drivers: " + e.getMessage());
        }
    }

    public void showAllDrivers() {
        for (Driver driver : drivers) {
            driver.showProfile();
        }
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}




















