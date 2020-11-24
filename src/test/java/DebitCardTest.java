import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    private DebitCard debitCard;

    @Before
    public void setUp(){
        debitCard = new DebitCard("1234123412341234", "01/23", 265, 233232, 1234567);

    }

    @Test
    public void canGetSortCode(){
        assertEquals(233232, debitCard.getSortCode());
    }

    @Test
    public void canGetAccountNumber(){
        assertEquals(1234567, debitCard.getAccountNumber());
    }
}
