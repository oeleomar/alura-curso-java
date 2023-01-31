
public abstract class Account {
  protected double balance;
  private int number;
  private int agency;
  private Cliente titular;
  private static int total;

  public Account() {
  }

  public Account(Cliente titular, int number, int agency) {
    Account.total++;
    this.titular = titular;
    this.number = number;
    this.agency = agency;
  }

  public abstract void deposit(double value);

  public void withdraw(double value) {
    if (value > this.balance)
      throw new SaldoInsuficienteException("Saldo: " + this.balance + ", Valor: " + value + ", Saldo insuficiente.");

    this.balance -= value;
  }

  public void transfer(Account account, double value) {
    this.withdraw(value);
    account.deposit(value);
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
