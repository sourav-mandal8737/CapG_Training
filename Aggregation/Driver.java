package Aggregation;

public class Driver {
    public static void main(String[] args) {
        Sim sim = new Sim(1234567895); 
        Phone phone = new Phone("Samsung", sim);
        
        phone.display();
        
        phone = null;  // Phone object removed, but Sim exists
        System.out.println(sim.phoneNo);  // Sim still accessible
    }
}
