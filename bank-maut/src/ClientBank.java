package src;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClientBank {
  private String name;
  private String cpf;
  private LocalDate birthDate;
  private List<HomeAddress> homeAddresses = new ArrayList<>();

  public ClientBank(String name, String cpf, LocalDate birthDate, HomeAddress homeAddress) {
    this.name = name;
    this.cpf = cpf;
    this.birthDate = birthDate;
    this.homeAddresses.add(homeAddress);
  };

  public String getName() {
    return this.name;
  };

  public String setName(String name) {
    return this.name = name;
  };

  public String getCPF() {
    return this.cpf;
  };

  public LocalDate getBirthDate() {
    return this.birthDate;
  };

  public LocalDate setBirthDate(LocalDate birthDate) {
    return this.birthDate = birthDate;
  };

  public List<HomeAddress> getHomeAddress() {
    return homeAddresses;
  };

  public void addHomeAddresses(HomeAddress homeAddresses) {
    this.homeAddresses.add(homeAddresses);
  }

  public void removeHomeAddresses(HomeAddress homeAddress) {
    this.homeAddresses.remove(homeAddress);
  }
}
