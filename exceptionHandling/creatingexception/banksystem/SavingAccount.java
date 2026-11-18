package exceptionHandling.creatingexception.banksystem;

public class SavingAccount {
    int balance = 1000;

    void withdraw(int amt) throws BankException{
        if(amt > balance){
            throw  new BankException("Insufficient amount");
        }
        System.out.println(amt + " debited from your acc ");
        balance -= amt;
    }

    void deposit(int amt){
        System.out.println(amt + " credited to your account");
        balance += amt;
    }

    void getBal(){
        System.out.println("balance: "+balance);
    }
}
