public class BankAccount {
  int agency;
  int number;
  String clientName;
  float balance;

  public float withdraw(float value) {
    System.out.println(value);
    return value;
  }

  public boolean cashDeposit(float value) {
    System.out.println(true);
    return true;
  }
}
