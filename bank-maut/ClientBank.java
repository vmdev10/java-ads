import java.time.LocalDate;

public class ClientBank {
  private String name;
  private String cpf;
  private LocalDate birthDate;
  private String address;

  public ClientBank(String name, String cpf, LocalDate birthDate, String address) {
    this.name = name;
    this.cpf = cpf;
    this.birthDate = birthDate;
    this.address = address;
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

  public String getAddress() {
    return this.address;
  };

  public String setAddress(String address) {
    return this.address = address;
  };
}
