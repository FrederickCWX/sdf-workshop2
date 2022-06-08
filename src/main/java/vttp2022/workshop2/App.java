package vttp2022.workshop2;

import vttp2022.workshop2.BankAccount;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My ATM Machine - POSSBank" );
        BankAccount bkAcc = new BankAccount("Fred Bank Account");
        bkAcc.deposit("1000");
        System.out.println("My new account balance >" +bkAcc.getBalance());
        bkAcc.withdraw("1001");
        System.out.println("My new account balance >" +bkAcc.getBalance());
    }
}
