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

  @Override // Método sobrescreve o método withdraw da classe pai "Account"
  public void withdraw(double value) {
    super.sendNotification("Saque", value);
    if (value <= super.balance) {
      super.balance = super.balance - value;
      System.out.println("Valor sacado com sucesso!! Sua conta agora tem: " + super.balance);
    } else {
      if (value <= super.balance + this.overdraft) {
        System.out.println("Cheque especial usado no valor de: " + this.overdraft);
        this.overdraft = 0;
        super.balance = super.balance - value;
        System.out.println("Valor sacado com sucesso!!! Sua conta agora tem: " + super.balance);
      } else {
        System.out.println("Saque acima do seu limite atual!!: ");
        System.out.println("Saldo atual: " + super.balance);
      }

    }
  }
}
