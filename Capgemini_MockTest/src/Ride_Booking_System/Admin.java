package Ride_Booking_System;

import java.lang.reflect.*;
import java.util.*;

@SecurityCheck(role = "Admin")
class Admin extends User {
    public Admin(String id, String name) {
        super(id, name);
    }

    @Override
    public void showProfile() {
        System.out.println("Admin Name: " + name + ", Role: Admin");
    }

    public void removeDriver(List<Driver> drivers, String driverId) {
        try {
            Class<?> clazz = this.getClass();
            if (clazz.isAnnotationPresent(SecurityCheck.class)) {
                SecurityCheck sc = clazz.getAnnotation(SecurityCheck.class);
                if ("Admin".equals(sc.role())) {
                    Iterator<Driver> iterator = drivers.iterator();
                    while (iterator.hasNext()) {
                        Driver driver = iterator.next();
                        if (driver.id.equals(driverId)) {
                            iterator.remove();
                            System.out.println("Driver removed successfully!");
                            return;
                        }
                    }
                    System.out.println("Driver ID not found.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error during driver removal: " + e.getMessage());
        }
    }
}
