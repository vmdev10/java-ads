public class App {
    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount();

        bankAccount.withdraw(1000);

        bankAccount.cashDeposit(500);
    }
}
