
public class Account {
  private double balance;
  private int number;
  private int agency;
  private Cliente titular;
  private static int total;

  public Account(Cliente titular, int number, int agency) {
    Account.total++;
    this.titular = titular;
    this.number = number;
    this.agency = agency;
  }

  public void deposit(double value) {
    this.balance += value;
  }

  public boolean withdraw(double value) {
    if (value > this.balance)
      return false;

    this.balance -= value;
    return true;
  }

  public boolean transfer(Account account, double value) {
    if (value > this.balance)
      return false;

    account.deposit(value);
    this.balance -= value;
    return true;
  }

  public double getBalance() {
    return this.balance;
  }

  public int getNumber() {
    return this.number;
  }

  public void setNumber(int number) {
    if (agency < 0)
      return;
    this.number = number;
  }

  public int getAgency() {
    return this.agency;
  }

  public void setAgency(int agency) {
    if (agency < 0)
      return;
    this.agency = agency;
  }

  public Cliente getTitular() {
    return this.titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public static int getTotal() {
    return total;
  }
}
