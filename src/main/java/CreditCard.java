import java.util.ArrayList;

public class CreditCard extends PaymentCard {

    private double creditLimit;

    public CreditCard(String cardNumber, String expiryDate, ArrayList<Double> charges, double creditLimit) {
        super(cardNumber, expiryDate, charges);
        this.creditLimit = creditLimit;
    }
}
