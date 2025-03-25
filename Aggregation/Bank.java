package Aggregation;

public class Bank {
    String bankName;
    Customer customer;
    
    public Bank(String bankName, Customer customer) {
        this.bankName = bankName;
        this.customer = customer;
    }
    
    public void display() {
        System.out.println("Bank: " + this.bankName + ", Customer: " + this.customer.customerName);
    }
}
