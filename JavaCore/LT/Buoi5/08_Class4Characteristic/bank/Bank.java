package bank;

public class Bank {
  public void simulate() {
    Person bob = new Person("Bob", "1978-11-20");
    Person alice = new Person("Alice", "1985-05-22");
    BankAccount.setInterestRate(0.05f);
    
    BankAccount bk1 = new BankAccount("012321", bob, 1500);
    BankAccount bk2 = new BankAccount("012338", bob, 500);
    BankAccount bk3 = new BankAccount("0242338", alice, 980);

    var banks = new BankAccount[]{bk1, bk2, bk3};
    for (BankAccount bank : banks) {
      System.out.println(bank);
    }
  }
}
