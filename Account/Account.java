public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }

    public int getId(){
        return this.id;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer.toString() +", Balance: " + balance;
    }

    public String getCustomerName(){
        return this.customer.getName();
    }

    public void deposit(double amount){
        balance = amount + balance;
    }

    public void withdraw(double amount){
        if(balance < amount){
        }else {
            balance = balance - amount;
        }

    }

}