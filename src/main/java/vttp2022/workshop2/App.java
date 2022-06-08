package vttp2022.workshop2;

import vttp2022.workshop2.BankAccount;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My ATM Machine - POSSBank" );
        BankAccount bkAcc = new BankAccount("Fred Bank Account");
        System.out.println(bkAcc.getName());
        bkAcc.deposit("1000");
        System.out.println("My new account balance >" +bkAcc.getBalance());
        bkAcc.withdraw("999");
        System.out.println("My new account balance >" +bkAcc.getBalance());
    }
}
