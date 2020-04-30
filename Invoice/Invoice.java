/**
 * Invoice
 */
public class Invoice {
    private
        int ID;
        Customer customer;
        double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    /**
     * @return the iD
     */
    public int getID() {
        return ID;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public double getAmountAfterDiscount() {
        double double_discount = customer.getDiscount();
        return (amount - (amount * (double_discount / 100)));
    }
}