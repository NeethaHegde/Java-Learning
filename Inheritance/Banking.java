class Bank{
    String bankName;

    void displayBankDetails(){
        System.out.println("Bank Details:" +bankName);
    }
} 
class Account extends Bank{
    int accountNo;
    int balance;
}
class SavingsAccount extends Account{
    float interestRate;

    void calculateIntrest(){
        double interest = balance * interestRate / 100;
        System.out.println("Interest Amount: " + interest);

    }
}
public class Banking {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.bankName = "SBI";
        sa.accountNo = 56783908;
        sa.balance = 100000;
        sa.interestRate = 5;
        sa.displayBankDetails();
        System.out.println("Account No: "+sa.accountNo);
        System.out.println("Balance: "+sa.balance);
        sa.calculateIntrest();
    }
}
