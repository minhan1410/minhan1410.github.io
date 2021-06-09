package bank;
public class BankAccount {  

  
  private String id;
  private static float interestRate;
  private Person owner;  
  private long balance;

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public static float getInterestRate() {
    return interestRate;
  }
  public static void setInterestRate(float interestRate) {
    BankAccount.interestRate = interestRate;
  }

  public Person getOwner() {
    return owner;
  }
  public void setOwner(Person owner) {
    this.owner = owner;
  }
  
  public long getBalance() {
    return balance;
  }
  public void setBalance(long balance) {
    this.balance = balance;
  }
  public BankAccount(String id, Person owner, long balance) {
    this.id = id;
    this.owner = owner;
    this.balance = balance;
  }
  @Override
  public String toString() {
    return "BankAccount [balance=" + balance + ", id=" + id + ", owner=" + owner + ", interestRate= "+interestRate+"]";
  }  
}