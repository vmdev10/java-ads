package src;

public class Account {
  private int branch; // Dessa forma esse atributo não é exposto para outras entidades acessarem
  private int number;
  private double balance;
  private ClientBank clientBank;

  public Account(int branch, int number, ClientBank clientBank) {
    System.out.println("Construindo o objeto da classe conta");
    this.branch = branch;
    this.number = number;
    this.clientBank = clientBank;
  }

  public int getBranch() {
    return this.branch;
  }

  public int getNumber() {
    return this.number;
  }

  public double getBalance() {
    return this.balance;
  }

  public ClientBank getClientBank() {
    return this.clientBank;
  }

  // Criando um método para acessar a classe Notification em apenas um lugar

  private void sendNotification(String operation, double value) {
    new Notification().sendEmail(operation, value);
  }

  public void deposit(double value) {
    sendNotification("Depósito", value);
    if (value < 0) {
      System.out.println("Não é possível realizar esta operação!");
    } else {
      this.balance = this.balance + value;

      System.out.println("Valor depositado, sua conta agora tem: " + this.balance);
    }
  }

  public void withdraw(double value) {
    sendNotification("Saque", value);
    if (value <= this.balance) {
      this.balance = this.balance - value;
      System.out.println("Valor sacado com sucesso!! Sua conta agora tem: " + this.balance);
    } else {
      System.out.println("Saque acima do seu limite atual!!: ");
      System.out.println("Saldo atual: " + this.balance);

    }
  }

  public void transfer(double value, Account fromAccount, Account toAccount) {
    sendNotification("Transferência", value);
    if (value <= fromAccount.balance && value > 0) {
      fromAccount.withdraw(value);
      toAccount.deposit(value);
    } else {
      System.out.println("Não foi possível concluir a transferência");
    }

  }
}
