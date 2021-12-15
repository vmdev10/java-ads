import java.time.LocalDate;

import javax.security.auth.login.AccountException;

public class App {
  public static void main(String[] args) {
    System.out.println("Número de contas no banco: " + Account.getNumberOfAccounts());

    System.out.println("=====================================");
    LocalDate birthDateClient1 = LocalDate.of(2002, 8, 25);
    ClientBank client1 = new ClientBank("Ana", "000.000.000-00", birthDateClient1, "Rua xxxx");

    Account account1 = new Account(123456, 45, client1);

    System.out.println("Número de contas no banco: " + Account.getNumberOfAccounts());
    System.out.println("=====================================");

    System.out.println("Cliente 1: " + account1.getClientBank().getName());
    System.out.println("CPF do cliente: " + account1.getClientBank().getCPF());
    System.out.println("Data de nascimento do cliente: " + account1.getClientBank().getBirthDate());
    System.out.println("Endereço do cliente: " + account1.getClientBank().getAddress());

    System.out.println("Agência: " + account1.getBranch());
    System.out.println("Número da conta: " + account1.getNumber());

    account1.deposit(550.90);
    System.out.println("Saldo da conta 1: " + account1.getBalance());

    account1.withdraw(800);

    account1.deposit(100);
    System.out.println("Saldo da conta 1: " + account1.getBalance());

    account1.withdraw(50);
    System.out.println("Saldo: " + account1.getBalance());

    System.out.println("=====================================");
    System.out.println("Número de contas no banco: " + Account.getNumberOfAccounts());
    System.out.println("=====================================");

    LocalDate birthDateClient2 = LocalDate.of(2019, 3, 04);
    ClientBank client2 = new ClientBank("Júlia", "111.111.111-00", birthDateClient2, "Rua yyyy");

    Account account2 = new Account(000, 88, client2);
    System.out.println("Número de contas no banco: " + Account.getNumberOfAccounts());
    System.out.println("=====================================");

    System.out.println("Cliente 2: " + account2.getClientBank().getName());
    System.out.println("CPF do cliente: " + account2.getClientBank().getCPF());
    System.out.println("Data de nascimento do cliente: " + account2.getClientBank().getBirthDate());
    System.out.println("Endereço do cliente: " + account2.getClientBank().getAddress());

    System.out.println("Agência: " + account2.getBranch());
    System.out.println("Número da conta: " + account2.getNumber());

    account2.deposit(2500.00);
    System.out.println("Saldo da conta 2: " + account2.getBalance());

    account2.withdraw(500.00);

    account2.deposit(750.00);
    System.out.println("Saldo da conta 2: " + account2.getBalance());

    account2.withdraw(500.00);
    System.out.println("Saldo: " + account2.getBalance());

    System.out.println("=====================================");
    account2.transfer(1000, account2, account1);
    System.out.println("Saldo da conta 1: " + account1.getBalance());
    System.out.println("Saldo da conta 2: " + account2.getBalance());
  }
}
