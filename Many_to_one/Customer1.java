package Many_to_one;

public class Customer1 {
	int id;
	String customerName;
	Bank1 bank;
	
	public Customer1(int id,String customerName,Bank1 bank) {
		this.id=id;
		this.customerName=customerName;
		this.bank=bank;
	}
	
	public void display() {
		System.out.println(this.id+" "+this.customerName+" "+this.bank.bankName);
	}

}
