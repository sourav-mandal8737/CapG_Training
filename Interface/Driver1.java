package Interface;

public class Driver1 {
    public static void main(String[] args) {
        Car1 c = new Car1("Tata", "V8", 1600);
        System.out.println(c.name + " " + c.engineType + " " + c.hp);
    }
}
