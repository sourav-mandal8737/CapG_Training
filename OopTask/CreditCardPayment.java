package OopTask;

class CreditCardPayment extends Payment {
	 public CreditCardPayment(double amount, String transactionId) {
	     super(amount, transactionId);
	 }

	 
	 
	 public void processPayment() {
	     System.out.println("Processing Credit Card Payment...");
	     System.out.println("Transaction ID: " + getTransactionId());

	     double originalAmount = getAmount();
	     double discount = applyDiscount();
	     double transactionFee = (originalAmount - discount) * 0.02; 
	     double finalAmount = (originalAmount - discount) + transactionFee;

	     System.out.printf("Original Amount: $%.2f%n", originalAmount);
	     System.out.printf("Discount Applied: $%.2f%n", discount);
	     System.out.printf("Transaction Fee: $%.2f%n", transactionFee);
	     System.out.printf("Final Payable Amount: $%.2f%n", finalAmount);
	     System.out.println("Credit Card Payment Successful!\n");
	 }
	}
