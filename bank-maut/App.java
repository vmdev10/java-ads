import java.time.LocalDate;

import javax.security.auth.login.AccountException;

public class App {
  public static void main(String[] args) {
    System.out.println("=====================================");
    LocalDate birthDateClient1 = LocalDate.of(2002, 8, 25);

    HomeAddress address1 = new HomeAddress("Rua Santa Helena", 370, "São José", "Picos", "Piauí");
    ClientBank client1 = new ClientBank("Ana", "000.000.000-00", birthDateClient1, address1);

    Account account1 = new Account(123456, 45, client1);

    System.out.println("Cliente 1: " + account1.getClientBank().getName());
    System.out.println("CPF do cliente: " + account1.getClientBank().getCPF());
    System.out.println("Data de nascimento do cliente: " + account1.getClientBank().getBirthDate());
    System.out.println("Logradouro: " + client1.getHomeAddress().getPublicPlace());
    System.out.println("Número: " + client1.getHomeAddress().getNumber());
    System.out.println("Bairro: " + client1.getHomeAddress().getDistrict());
    System.out.println("Cidade: " + client1.getHomeAddress().getCity());
    System.out.println("UF: " + client1.getHomeAddress().getFederativeUinit());

    System.out.println("=====================================");
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

    LocalDate birthDateClient2 = LocalDate.of(2019, 3, 04);
    HomeAddress address2 = new HomeAddress("Rua Dom Severino", 240, "São Silvestre", "Campinas", "São Paulo");
    ClientBank client2 = new ClientBank("Júlia", "111.111.111-00", birthDateClient2, address2);

    Account account2 = new Account(000, 88, client2);

    System.out.println("Cliente 2: " + account2.getClientBank().getName());
    System.out.println("CPF do cliente: " + account2.getClientBank().getCPF());
    System.out.println("Data de nascimento do cliente: " + account2.getClientBank().getBirthDate());
    System.out.println("Logradouro: " + client2.getHomeAddress().getPublicPlace());
    System.out.println("Número: " + client2.getHomeAddress().getNumber());
    System.out.println("Bairro: " + client2.getHomeAddress().getDistrict());
    System.out.println("Cidade: " + client2.getHomeAddress().getCity());
    System.out.println("UF: " + client2.getHomeAddress().getFederativeUinit());

    System.out.println("=====================================");
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
