package Interface;

public class Car1 extends Vehicle1 {
    int hp;

    public Car1(String name, String engType, int hp) {
        super(name, engType);
        this.hp = hp;
        System.out.println("Child");
    }
}
