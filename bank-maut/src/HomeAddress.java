public class HomeAddress {
  private String publicPlace;
  private int number;
  private String district;
  private String city;
  private String federativeUnit;

  public HomeAddress(String publicPlace, int number, String district, String city, String federativeUnit) {
    this.publicPlace = publicPlace;
    this.number = number;
    this.district = district;
    this.city = city;
    this.federativeUnit = federativeUnit;
  }

  public String getPublicPlace() {
    return this.publicPlace;
  };

  public int getNumber() {
    return this.number;
  };

  public String getDistrict() {
    return this.district;
  };

  public String getCity() {
    return this.city;
  };

  public String getFederativeUinit() {
    return this.federativeUnit;
  };
}