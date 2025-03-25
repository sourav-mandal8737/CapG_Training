package Many_to_one;

public class Driver {
	public static void main(String[] args) {
		Bank bank=new Bank("sbi");
		Customer c1=new Customer(1, "Rohit", bank);
		Customer c2=new Customer(2, "Raj", bank);
		Customer c3=new Customer(3, "Ram", bank);
        
		c1.display();
		c2.display();
		c3.display();
	}

}
