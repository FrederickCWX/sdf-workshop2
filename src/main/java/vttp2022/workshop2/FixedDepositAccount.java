package vttp2022.workshop2;

public class FixedDepositAccount extends BankAccount{
  private float interest = 3;
  private int duration = 6;
  private int durationInterestCounterSet = 0;

  public FixedDepositAccount(String name, float initialAmount){
    super(name, initialAmount);
    this.durationInterestCounterSet = 0;
  }

  public FixedDepositAccount(String name, float initialAmount, float interest){
    super(name, initialAmount);
    this.interest = interest;
    this.durationInterestCounterSet = 0;
  }

  public FixedDepositAccount(String name, float initialAmount, float interest, int duration){
    super(name, initialAmount);
    this.interest = interest;
    this.duration = duration;
    this.durationInterestCounterSet = 0;
  }

  public int getDuration() {
    return duration;
  }

  private void setDuration(int duration) {
    if(duration < 0){
      throw new IllegalArgumentException("Unsupported duration");
    }
    this.duration = duration;
  }

  private void setInterest(float interest) {
    if(interest < 0){
      throw new IllegalArgumentException("Unsupported interest");
    }
    this.interest = interest;
  }

  public void setDurationAndInterest(float interest, int duration) {
    if(durationInterestCounterSet > 0){
      throw new IllegalArgumentException("Only can set interest and duration once.");
    }
    setInterest(interest);
    setDuration(duration);
    durationInterestCounterSet++;
  }

  @Override
  public float withdraw(String withdrawAmt){
    return 0;
  }

  @Override
  public void deposit(String depositAmt){
    
  }

  @Override
  public float getBalance(){
    return super.getBalance() + interest;
  }
  
}
