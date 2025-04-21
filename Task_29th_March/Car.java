package Task_29th_March;

class Car extends AbstractVehicle {
	 public Car(String name, int speed) {
	     super(name, speed);
	 }

	 @Override
	 public void start() {
	     System.out.println(name + " car started.");
	 }

	 @Override
	 public void stop() {
	     System.out.println(name + " car stopped.");
	 }

	 @Override
	 public void displayType() {
	     System.out.println(name + " is a Car.");
	 }
	}
