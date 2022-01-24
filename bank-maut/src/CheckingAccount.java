package src;

public class CheckingAccount extends Account {
  private double overdraft;

  public CheckingAccount(int branch, int number, ClientBank clientBank) {
    // O super faz referência à atributos e métodos da classe pai
    super(branch, number, clientBank);
    this.overdraft = 500;
  }

  public void setOverdraft(double overdraft) {
    this.overdraft = overdraft;
  }

  public double getOverdraft() {
    return overdraft;
  }
}
