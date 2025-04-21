package Task_29th_March;

class Truck extends AbstractVehicle {
	 public Truck(String name, int speed) {
	     super(name, speed);
	 }

	 @Override
	 public void start() {
	     System.out.println(name + " truck started.");
	 }

	 @Override
	 public void stop() {
	     System.out.println(name + " truck stopped.");
	 }

	 @Override
	 public void displayType() {
	     System.out.println(name + " is a Truck.");
	 }
	}