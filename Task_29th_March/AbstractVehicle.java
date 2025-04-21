package Task_29th_March;

abstract class AbstractVehicle implements Vehicle {
    protected String name;
    protected int speed;

    public AbstractVehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void displayDetails() {
        System.out.println("Vehicle Name: " + name);
        System.out.println("Current Speed: " + speed + " km/h");
    }

    @Override
    public void accelerate(int increment) {
        speed += increment;
        System.out.println(name + " accelerated. New speed: " + speed + " km/h");
    }

    @Override
    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;
        System.out.println(name + " applied brakes. New speed: " + speed + " km/h");
    }

    @Override
    public int getCurrentSpeed() {
        return speed;
    }
}
