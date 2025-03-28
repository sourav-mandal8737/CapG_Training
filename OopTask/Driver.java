package OopTask;

public class Driver {
		 public static void main(String[] args) {
		     Payment creditCardPayment = new CreditCardPayment(600, "TXN12345");
		     creditCardPayment.processPayment();

		     Payment paypalPayment = new PayPalPayment(300, "TXN67890");
		     paypalPayment.processPayment();
		 }
		}

