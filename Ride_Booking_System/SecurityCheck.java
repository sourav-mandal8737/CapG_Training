package Ride_Booking_System;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface SecurityCheck {
    String role();
}

