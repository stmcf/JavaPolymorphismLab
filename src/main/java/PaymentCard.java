import java.util.ArrayList;

public abstract class PaymentCard {

    private String cardNumber;
    private String expiryDate;
    private int cvv;
    private ArrayList<Double> charges;

    public PaymentCard(String cardNumber, String expiryDate, int cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.charges = new ArrayList<>();

    }

    public ArrayList<Double> getCharges(){
        return this.charges;
    }

}
