package vttp2022.workshop2;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
//generate uuid
import java.util.UUID;

import javax.sound.midi.Soundbank;

public class BankAccount {
  //source action getters and setters 
  private String name ="";

  //random ID genereate from UUID package, change to string, limit the length of string
  private String acctId = UUID.randomUUID()
                              .toString()
                              .substring(0, 8);

  private float balance = 0f;
  
  private List<String> transaction = new LinkedList<>();

  private boolean isClosed = false;

  private LocalDateTime accountCreationDate;
  private LocalDateTime accountClosingDate;

  //first constructor name
  public BankAccount(String name){
    this.name = name;
  }

  //second constructor name and initial balance
  public BankAccount(String name, float initialBal){
    this.name = name;
    this.balance = initialBal;
  }

  //Getter and setter for rest of properties
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAcctId() {
    return acctId;
  }

  public void setAcctId(String acctId) {
    this.acctId = acctId;
  }

  public float getBalance() {
    return balance;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }

  public List<String> getTransaction() {
    return transaction;
  }

  public void setTransaction(List<String> transaction) {
    this.transaction = transaction;
  }

  public boolean isClosed() {
    return isClosed;
  }

  public void setClosed(boolean isClosed) {
    this.isClosed = isClosed;
  }

  public LocalDateTime getAccountCreationDate() {
    return accountCreationDate;
  }

  public void setAccountCreationDate(LocalDateTime accountCreationDate) {
    this.accountCreationDate = accountCreationDate;
  }

  public LocalDateTime getAccountClosingDate() {
    return accountClosingDate;
  }

  public void setAccountClosingDate(LocalDateTime accountClosingDate) {
    this.accountClosingDate = accountClosingDate;
  }

  protected float withdraw(String withdrawAmt){
    Float withdrawAmtF = Float.parseFloat(withdrawAmt);
    try {
      
      if(withdrawAmtF.floatValue()<=0){
        throw new IllegalArgumentException("Withdrawl amount cannot be negative or kosong");
      }

      if(this.isClosed()){
        throw new IllegalArgumentException("Account is closed lah!");
      }

      this.balance = this.balance - withdrawAmtF.floatValue();
      //Similar to printf just manually format
      StringBuilder txnStrbld = new StringBuilder();
      txnStrbld.append("Withdraw $");
      txnStrbld.append(withdrawAmtF.floatValue());
      txnStrbld.append("at");
      txnStrbld.append(LocalDateTime.now());
      System.out.println(txnStrbld.toString());
      transaction.add(txnStrbld.toString());
      
    } catch (NumberFormatException e) {
      System.err.print(e);
      throw new IllegalArgumentException("Invalid withdrawl amount");
    }
    return withdrawAmtF.floatValue();
  }

  protected void deposit(String depositAmt){
    try {
      Float depositAmtF = Float.parseFloat(depositAmt);
      if(depositAmtF.floatValue()<=0){
        throw new IllegalArgumentException("Deposit amount cannot be negative or kosong");
      }

      if(this.isClosed()){
        throw new IllegalArgumentException("Account is closed lah!");
      }

      this.balance = this.balance + depositAmtF.floatValue();
      //Similar to printf just manually format
      StringBuilder txnStrbld = new StringBuilder();
      txnStrbld.append("Deposit $");
      txnStrbld.append(depositAmtF.floatValue());
      txnStrbld.append("at");
      txnStrbld.append(LocalDateTime.now());
      System.out.println(txnStrbld.toString());
      transaction.add(txnStrbld.toString());
      
    } catch (NumberFormatException e) {
      System.err.print(e);
      throw new IllegalArgumentException("Invalid deposit amount");
    }
    
  }

}
