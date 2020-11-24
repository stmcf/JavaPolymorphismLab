import java.util.ArrayList;

public abstract class PaymentCard {

    private String cardNumber;
    private String expiryDate;
    private ArrayList<Double> charges;

    public PaymentCard(String cardNumber, String expiryDate, ArrayList<Double> charges) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.charges = new ArrayList<Double>();
    }
}
