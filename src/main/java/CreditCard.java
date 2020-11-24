import java.util.ArrayList;

public class CreditCard extends PaymentCard implements IChargeable{

    private double creditLimit;
    private double riskMultiplier;

    public CreditCard(String cardNumber, String expiryDate, int cvv, double creditLimit, double riskMultiplier) {
        super(cardNumber, expiryDate, cvv);
        this.creditLimit = creditLimit;
        this.riskMultiplier = riskMultiplier;
    }

    @Override
    public double getTransactionCost(double purchaseAmount) {
        return 0;
    }

    @Override
    public void charge(double purchaseAmount) {

    }

    public double getCreditLimit(){
        return this.creditLimit;
    }

    public double getRiskMultiplier(){
        return this.riskMultiplier;
    }

}
