public class GiftCard {
    private String retailer;
    private Double balance;

    public GiftCard(String retailer, double balance){
        this.retailer = retailer;
        this.balance = balance;
    }

    public String getRetailer(){
        return this.retailer;
    }

    public Double getBalance(){
        return this.balance;
    }

    public void chargeCustomer(double charge){
        if(charge < this.balance)
            this.balance -= charge;
    }
}
