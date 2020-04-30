
public class Invoice {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public Invoice(String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    public String getId(){
        return this.id;
    }
    public String getDesc(){
        return this.desc;
    }
    public int getQty(){
        return this.qty;
    }
    public double getUnitPrice(){
        return this.unitPrice;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return unitPrice*qty;
    }

    @Override
    public String toString() {
        return "Invoice_item [id = " +this.id+ " desc = " + this.desc + " qty = " +this.qty+ " Unit price = " +this.unitPrice+ "]" ;
    }
}