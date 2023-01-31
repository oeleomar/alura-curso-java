public class ContaCorrente extends Account {
  public ContaCorrente() {

  }

  @Override
  public void deposit(double value) {
    super.balance += value;
  }

  @Override
  public void withdraw(double value) {
    double valorSacar = value + 0.2;
    super.withdraw(valorSacar);
  }

}
