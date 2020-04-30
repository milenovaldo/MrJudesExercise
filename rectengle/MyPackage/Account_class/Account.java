
public class Account {
    private String id;
    private String name;
    private int balance = 0;
    private String Recepient;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return this.balance;
    }
    public int credit(int amount){
        balance = amount + balance;
        return balance;
    }
    public int debit(int amount){
        if(amount<= balance){
            balance = balance - amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int Transfer(Account Recepient, int amount){
        Recepient.credit(amount);
        Recepient.debit(amount);
        return balance;
    }

    @Override
    public String toString() {
        return "Account [id = " + this.id + " name = " + this.name + " balance = " + this.balance + "]";
    }
}