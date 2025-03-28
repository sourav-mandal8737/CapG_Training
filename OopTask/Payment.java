package OopTask;

abstract class Payment {
 private double amount;
 private String transactionId;

 public Payment(double amount, String transactionId) {
     this.amount = amount;
     this.transactionId = transactionId;
 }

 public double getAmount() {
     return amount;
 }

 public String getTransactionId() {
     return transactionId;
 }

 protected double applyDiscount() {
     return amount > 500 ? amount * 0.1 : 0; 
 }

 public abstract void processPayment();
}

	
	
	
