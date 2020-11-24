import java.util.ArrayList;

public class DebitCard extends PaymentCard {

    private int sortCode;
    private int accountNumber;

    public DebitCard(String cardNumber, String expiryDate, ArrayList<Double> charges, int sortCode, int accountNumber) {
        super(cardNumber, expiryDate, charges);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }




}
