package src;

public class CheckingAccount extends Account {

  public CheckingAccount(int branch, int number, ClientBank clientBank) {
    // O super faz referência à atributos e métodos da classe pai
    super(branch, number, clientBank);
  }
}
