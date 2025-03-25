package One_to_many;

public class Bank1 {
    Customer1[] customers;
    String bankName;
    static int index = 0;

    public Bank1(int size, String bankName) {
        this.customers = new Customer1[size];
        this.bankName = bankName;
    }

    public void addCustomer(Customer1 customer) {
        if (index < customers.length) {
            customers[index++] = customer;
        } else {
            System.out.println("Cannot add customer, the array is filled.");
        }
    }

    public void displayCustomer() {
        for (int i = 0; i < index; i++) {
            System.out.println(customers[i]);
        }
    }

    public void removeCustomerById(int id) {
        for (int i = 0; i < index; i++) {
            if (customers[i].getCustomerId() == id) {
                for (int j = i; j < index - 1; j++) {
                    customers[j] = customers[j + 1];
                }
                customers[--index] = null; 
                System.out.println("Customer with ID " + id + " has been removed.");
                return;
            }
        }
        System.out.println("Customer with ID " + id + " not found.");
    }

    public void updateCustomerNameById(int id, String newName) {
        for (int i = 0; i < index; i++) {
            if (customers[i].getCustomerId() == id) {
                customers[i].setCustomerName(newName);
                System.out.println("Customer with ID " + id + " has been updated.");
                return;
            }
        }
        System.out.println("Customer with ID " + id + " not found.");
    }

    public void fetchCustomerById(int id) {
        for (int i = 0; i < index; i++) {
            if (customers[i].getCustomerId() == id) {
                System.out.println(customers[i]);
                return;
            }
        }
        System.out.println("Customer with ID " + id + " not found.");
    }
}
