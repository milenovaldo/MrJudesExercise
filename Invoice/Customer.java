/**
 * Customer
 */
public class Customer {
    private
        int ID;
        String name;
        int discount;

    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    /**
     * @return the iD
     */
    public int getID() {
        return ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the discount
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.ID + ")";
    }
}