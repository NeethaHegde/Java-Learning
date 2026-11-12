package OOPS.encapsulation;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println("Available Balance: " +bank.getbalance());
        bank.withdraw(1000);
        System.out.println("Balance after withdraw: "+bank.getbalance());
        bank.deposit(8000);// call by value
        System.out.println("Balance after deposit: "+ bank.getbalance());

        SBI sbi = new SBI();
        sbi.check(bank);// call by reference
        System.out.println(bank.getbalance());
       
    }
}
