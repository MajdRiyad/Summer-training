abstract public class CustomerPayment {
    private String customerName;
    private  int customerID;
    private double amount;

    public CustomerPayment(String customerName, int customerID, double amount) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.amount = amount;
    }
    public abstract double calculatePayment ();

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toString() {
        return this.customerName + "," + this.customerID + "," + this.amount + "," + this.amount;
    }

}
