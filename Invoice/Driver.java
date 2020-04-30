/**
 * Driver
 */
public class Driver {

    public static void main(String[] args) {
        Customer customer_1 = new Customer(47, "Agent", 10);

        customer_1.setDiscount(20);

        System.out.println(customer_1.getDiscount());
        
        Invoice shopping_purchase = new Invoice(69, customer_1, 100000);

        System.out.println(shopping_purchase.getAmountAfterDiscount());;
    }
}