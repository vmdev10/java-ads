import java.time.LocalDate;

public class ClientBank {
  private String name;
  private String cpf;
  private LocalDate birthDate;
  private HomeAddress homeAddress;

  public ClientBank(String name, String cpf, LocalDate birthDate, HomeAddress homeAddress) {
    this.name = name;
    this.cpf = cpf;
    this.birthDate = birthDate;
    this.homeAddress = homeAddress;
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

  public HomeAddress getHomeAddress() {
    return this.homeAddress;
  };

}
