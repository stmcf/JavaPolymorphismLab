import java.util.ArrayList;

public class DebitCard extends PaymentCard implements IChargeable {

    private int sortCode;
    private int accountNumber;

    public DebitCard(String cardNumber, String expiryDate, int cvv, int sortCode, int accountNumber) {
        super(cardNumber, expiryDate, cvv);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    @Override
    public double getTransactionCost(double purchaseAmount) {
        return 0;
    }

    @Override
    public void charge(double purchaseAmount) {

    }

    public int getSortCode(){
        return this.sortCode;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }
}
