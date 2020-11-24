import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    private CreditCard creditCard;

    @Before
    public void setUp(){
        creditCard = new CreditCard("456112345678945612", "03/22", 124, 5000.00, 2.25);
    }

    @Test
    public void chargesStartEmpty(){
        assertEquals(0, creditCard.getCharges().size());
    }

    @Test
    public void canGetCreditLimit(){
        assertEquals(5000.00, creditCard.getCreditLimit(), 0.01);
    }

    @Test
    public void canGetRiskMultiplier(){
        assertEquals(2.25, creditCard.getRiskMultiplier(), 0.01);
    }
}
