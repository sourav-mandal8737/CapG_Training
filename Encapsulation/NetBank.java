package Encapsulation;

public class NetBank {
	private int currentBalance=50000;
	private int pin=1234;
	
	public void setBalance(int deposit, int pin) {
		if(this.pin==pin) {
		currentBalance+=deposit;
	}else {
		System.out.println("Invalid pin");
	}
		
	}
	
	public void getBalance(int pin) {
		if(this.pin==pin) {
			System.out.println(currentBalance);
		}else {
			System.out.println("Invalid pin");
		}
	}
	
	public void withdraw(int withdraw,int pin) {
		if(this.pin==pin) {
			if(currentBalance>=withdraw) {
				currentBalance-=withdraw;
				System.out.println(withdraw);
			}else {
				System.out.println("Insufficient Balance");
			}
		}

	}

}
