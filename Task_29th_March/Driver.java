package Task_29th_March;

public class Driver {
		 public static void main(String[] args) {
		     Vehicle car = new Car("Toyota", 50);
		     Vehicle bike = new Bike("Yamaha", 30);
		     Vehicle truck = new Truck("Volvo", 40);

		     car.start();
		     car.accelerate(20);
		     car.brake(10);
		     car.displayType();
		     car.stop();

		     System.out.println();

		     bike.start();
		     bike.accelerate(15);
		     bike.brake(5);
		     bike.displayType();
		     bike.stop();

		     System.out.println();

		     truck.start();
		     truck.accelerate(25);
		     truck.brake(15);
		     truck.displayType();
		     truck.stop();
		 }
}

