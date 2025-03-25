package One_to_many;

public class Customer1 {
    String customerName;
    int customerId;

    public Customer1(String customerName, int customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String toString() {
        return "Customer ID: " + customerId + ", Customer Name: " + customerName;
    }
}
