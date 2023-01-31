public class TesteSaque {
  public static void main(String[] args) {
    Account conta = new ContaCorrente();
    conta.deposit(200);
    conta.withdraw(190);

    try {
      conta.withdraw(10);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println(conta.getBalance());
  }
}
