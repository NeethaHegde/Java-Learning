package OOPS.encapsulation;

public class Bank {
    private int balance = 2000;

    public int getbalance(){
        return balance;
    }
    
    public void withdraw(int amount){
        System.out.println(amount + " has been withdrawn successfully");
        balance-=amount;
    }

    public void deposit(int amount){
        System.out.println(amount + " has been credited");
        balance+= amount;
    }
}
