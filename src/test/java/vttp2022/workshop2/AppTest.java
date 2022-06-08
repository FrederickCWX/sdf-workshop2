package vttp2022.workshop2;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import vttp2022.workshop2.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testBankAccout(){
        BankAccount bkAcc = new BankAccount("Fred Bank Account");
        bkAcc.deposit("1000");
        float finalBalance = bkAcc.withdraw("500");
        assertEquals(500, finalBalance, .1);

    }

    @Test
    public void testFixedDepositAccout(){
        try{
            FixedDepositAccount fdAcc = new FixedDepositAccount("My FD acc", 1000);

            fdAcc.setDurationAndInterest(4, 12);
            fdAcc.setDurationAndInterest(5, 10);

        }catch(IllegalArgumentException e){
            assertTrue("Only can set interest and duration once.".equals(e.getMessage()));
        }
        


    }
}
