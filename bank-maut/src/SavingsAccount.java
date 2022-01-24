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

}
