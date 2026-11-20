package threads.banksystem;

public class Bank {
    private  int balance=1000;

    synchronized public void withdraw(int amount) throws BankException {
        if(amount<=balance){
            System.out.println(amount+ " withdraw");
            balance-=amount;
        }
        else{
            throw new BankException("Insufficient amount");
        }
    }

    public void deposite(int amount){
        System.out.println(amount+ " credited");
        balance+=amount;
    }

    public void getBal(){
        System.out.println("bal = "+balance);
    }

}