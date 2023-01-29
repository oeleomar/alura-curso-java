
public class CreateAccount {
  public static void main(String[] args) {
    Cliente cliente = new Cliente("Eleomar Dorneles", "042.261.821-70");
    Cliente cliente2 = new Cliente("Cliente 2", "000.000.000-00");

    Account conta1 = new Account(cliente, 0001, 0001);
    Account conta2 = new Account(cliente2, 0002, 0001);

    makeTransitions(conta1, conta2);

  }

  public static void makeTransitions(Account conta1, Account conta2) {
    conta1.deposit(50.0001);

    if (conta1.withdraw(100)) {
      System.out.println("Saque realizado com sucesso");
    } else {
      System.out.println("Valor para saque inválido");
    }

    if (conta1.transfer(conta2, 50)) {
      System.out.println("Transferencia realizada com sucesso");
    } else {
      System.out.println("Transferencia não pode ser concluída.");
    }
  }
}
