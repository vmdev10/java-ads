import javax.security.auth.login.AccountException;

public class App {
  public static void main(String[] args) {
    Account account1 = new Account();

    account1.branch = 123;
    account1.number = 456;
    account1.balance = 100;

    ClientBank client1 = new ClientBank();
    client1.name = "Ana";
    client1.cpf = "0123";

    account1.clientBank = client1;

    System.out.println("Agência: " + account1.branch);
    System.out.println("Número da conta: " + account1.number);
    System.out.println("Saldo: " + account1.balance);
    System.out.println("Cliente da conta: " + account1.clientBank.name);
    System.out.println("CPF do cliente: " + account1.clientBank.cpf);
  }
}
