package src;

import java.time.LocalDate;

public class App {
        public static void main(String[] args) {
                LocalDate birthDateClient1 = LocalDate.of(2002, 8, 25);
                ClientBank client1 = new ClientBank("Ana", "000.000.000-00", birthDateClient1,
                                new HomeAddress("Avenida Getúlio Vargas", 370, "Bairro São José", "Picos", "Piauí"));

                System.out.println(
                                "================================== Cliente 1 ========================================");
                System.out.println("Nome: " + client1.getName());
                System.out.println("CPF: " + client1.getCPF());
                System.out.println("Data de nascimento: " + client1.getBirthDate());
                System.out.println("Endreço principal: " + client1.getHomeAddress().get(0).getPublicPlace() + ", "
                                + client1.getHomeAddress().get(0).getDistrict() + ", "
                                + client1.getHomeAddress().get(0).getNumber() + ", "
                                + client1.getHomeAddress().get(0).getCity() + ", "
                                + client1.getHomeAddress().get(0).getFederativeUinit());

                System.out.println(
                                "================================== Cliente 1 ========================================");
                System.out.println(
                                "================================== Criando um novo endereço... ========================================");

                client1.addHomeAddresses(new HomeAddress("publicPlace", 000, "district", "city", "federativeUnit"));
                System.out.println("Endreço principal: " + client1.getHomeAddress().get(1).getPublicPlace() + ", "
                                + client1.getHomeAddress().get(1).getDistrict() + ", "
                                + client1.getHomeAddress().get(1).getNumber() + ", "
                                + client1.getHomeAddress().get(1).getCity() + ", "
                                + client1.getHomeAddress().get(1).getFederativeUinit());

                CheckingAccount accountX = new CheckingAccount(001, 1, client1);
                SavingsAccount accountY = new SavingsAccount(001, 2, client1);

                System.out.println(
                                "================================== Cliente 1 ========================================");
                System.out.println(
                                "================================== Criando uma conta... ========================================");

                System.out.println("Agência: " + accountX.getBranch());
                System.out.println("Número da conta: " + accountX.getNumber());

                System.out.println(
                                "================================== Cliente 1 ========================================");
                System.out.println(
                                "================================== Movimentações... ========================================");

                accountX.deposit(800);
                accountX.withdraw(1250);
                accountX.withdraw(250);

                accountY.deposit(1000);

                accountY.transfer(100, accountY, accountX);

        }

}
