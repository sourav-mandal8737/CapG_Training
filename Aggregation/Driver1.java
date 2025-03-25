package Aggregation;

public class Driver1 {
    public static void main(String[] args) {
        Customer customer = new Customer("Ram Roy"); 
        Bank bank = new Bank("SBI", customer);    
        
        bank.display();
        
        bank = null;  // Bank object removed, but Customer still exists
        System.out.println("Customer still exists: " + customer.customerName);
    }
}
