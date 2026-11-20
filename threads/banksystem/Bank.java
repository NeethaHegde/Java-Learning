package threads.banksystem;

public class Bank {
    private  int balance=1000;

    synchronized public void withdraw(int amount){
        if(amount<=balance){
            System.out.println(amount+ " withdraw");
            balance-=amount;
        }
        else{
            System.out.println("insuffient amount");
        }
    }

    public void deposit(int amount){
        System.out.println(amount+ " credited");
        balance+=amount;
    }

    public void getBal(){
        System.out.println("bal = "+balance);
    }

}