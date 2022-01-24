package src;

public class SavingsAccount extends Account {
  private double income;

  public SavingsAccount(int branch, int number, ClientBank clientBank) {
    // O super faz referência à atributos e métodos da classe pai
    super(branch, number, clientBank);
    this.income = 0.02;
  }

  public void setIncome(double income) {
    this.income = income;
  }

  public double getIncome() {
    return income;
  }

  @Override
  public void transfer(double value, Account fromAccount, Account toAccount) {
    super.sendNotification("Transferência", value);
    if (value <= fromAccount.balance && value > 0) {
      fromAccount.withdraw(value + (value * 0.05));
      toAccount.deposit(value);

    } else {
      System.out.println("Não foi possível concluir a transferência");
    }

  }

  @Override
  public void deposit(double value) {
    sendNotification("Depósito", value);
    if (value < 0) {
      System.out.println("Não é possível realizar esta operação!");
    } else {
      this.balance = ((this.balance + value) * 0.02) + (this.balance + value);

      System.out.println("Valor depositado, sua conta agora tem: " + this.balance);
    }
  }

}
