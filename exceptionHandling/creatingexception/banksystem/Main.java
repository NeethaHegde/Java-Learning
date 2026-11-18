package exceptionHandling.creatingexception.banksystem;

public class Main {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.getBal();
        try {
            sa.withdraw(2000);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
        sa.getBal();
        sa.deposit(2000);
        sa.getBal();
    }
}
