package Composition;

public class Phone {
    String phoneName;
    Battery b;
    
    public Phone(String phoneName, String batteryType) {
        this.phoneName = phoneName;
        this.b = new Battery(batteryType);
    }
    
    public void display1() {
        System.out.println(phoneName + " " + b.type);  
    }
}
