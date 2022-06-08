package vttp2022.workshop2;

import vttp2022.workshop2.BankAccount;
import vttp2022.workshop2.FixedDepositAccount;

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

        FixedDepositAccount fdAcc = new FixedDepositAccount("My FD acc", 1000);

        System.out.println("Fixed Deposit Acc balance >" +fdAcc.getBalance());

        fdAcc.setDurationAndInterest(4, 12);
        System.out.println("Fixed Deposit Acc balance >" +fdAcc.getBalance());
        fdAcc.setDurationAndInterest(5, 10);
    }
}
