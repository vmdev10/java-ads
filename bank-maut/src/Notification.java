package src;

public class Notification {

  public void sendEmail(String operation, double value) {
    System.out.println("#### Enviando e-mail... ####");
    System.out.println("Operação realizada: " + operation);
    System.out.println("Valor: " + value);
    System.out.println("E-mail enviado! " + value);
  }
}