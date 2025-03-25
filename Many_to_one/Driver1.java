package Many_to_one;

public class Driver1 {
	public static void main(String[] args) {
		Bank1 bank=new Bank1("sbi");
		Customer1 c1=new Customer1(1, "Rohit", bank);
		Customer1 c2=new Customer1(2, "Raj", bank);
		Customer1 c3=new Customer1(3, "Ram", bank);
        
		c1.display();
		c2.display();
		c3.display();
	}

}
