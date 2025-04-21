package Task_29th_March;

class Bike extends AbstractVehicle {
	 public Bike(String name, int speed) {
	     super(name, speed);
	 }

	 @Override
	 public void start() {
	     System.out.println(name + " bike started.");
	 }

	 @Override
	 public void stop() {
	     System.out.println(name + " bike stopped.");
	 }

	 @Override
	 public void displayType() {
	     System.out.println(name + " is a Bike.");
	 }
	}
