package One_to_many;

import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        
        Bank1 bank = new Bank1(size, "SBI");
        boolean flag = true;

        int customerId = 1;

        while (flag) {
            System.out.println("Enter 1 to add customer\nEnter 2 to display customers\nEnter 3 to remove customer\nEnter 4 to update customer\nEnter 5 to fetch customer by ID\nEnter 6 to exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); 
                    System.out.println("Enter customer name:");
                    String name = sc.nextLine();
                    Customer1 customer = new Customer1(name, customerId++);
                    bank.addCustomer(customer);
                    break;
                case 2:
                    bank.displayCustomer();
                    break;
                case 3:
                    System.out.println("Enter customer ID to remove:");
                    int removeId = sc.nextInt();
                    bank.removeCustomerById(removeId);
                    break;
                case 4:
                    System.out.println("Enter customer ID to update:");
                    int updateId = sc.nextInt();
                    sc.nextLine(); 
                    System.out.println("Enter new customer name:");
                    String newName = sc.nextLine();
                    bank.updateCustomerNameById(updateId, newName);
                    break;
                case 5:
                    System.out.println("Enter customer ID to fetch:");
                    int fetchId = sc.nextInt();
                    bank.fetchCustomerById(fetchId);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}


