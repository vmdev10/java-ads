public class Account {
  private int branch; // Dessa forma esse atributo não é exposto para outras entidades acessarem
  private int number;
  private double balance;
  // Com o static o atributo numberOfAccounts, pertence a classe Account e não ao
  // objeto atual;
  private static int numberOfAccounts;
  private ClientBank clientBank;

  public Account(int branch, int number, ClientBank clientBank) {
    System.out.println("Construindo o objeto da classe conta");
    this.branch = branch;
    this.number = number;
    // Com o static o atributo numberOfAccounts, pertence a classe Account e não ao
    // objeto atual; (Nesse caso, não é possível acessá-lo com o this.)
    numberOfAccounts++;
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

  public static int getNumberOfAccounts() {
    return numberOfAccounts;
  }

  public void deposit(double value) {
    if (value < 0) {
      System.out.println("Não é possível realizar esta operação!");
    } else {
      this.balance = this.balance + value;
      System.out.println("Valor depositado, sua conta agora tem: " + this.balance);
    }
  }

  public void withdraw(double value) {
    if (value <= this.balance) {
      this.balance = this.balance - value;
      System.out.println("Valor sacado com sucesso!! Sua conta agora tem: " + this.balance);
    } else {
      System.out.println("Saque acima do seu limite atual!!: ");
      System.out.println("Saldo atual: " + this.balance);

    }
  }

  public void transfer(double value, Account fromAccount, Account toAccount) {
    if (value <= fromAccount.balance && value > 0) {
      fromAccount.withdraw(value);
      toAccount.deposit(value);
    } else {
      System.out.println("Não foi possível concluir a transferência");
    }

  }
}
