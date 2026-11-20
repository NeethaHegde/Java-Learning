package threads.banksystem;

public class PhonePay extends Thread{
    Bank bank;
    String op;
    int amount;
    PhonePay(Bank bank,String op,int amount){
        this.bank=bank;
        this.op=op;
        this.amount=amount;
    }

    public void disp(){
        if(op=="withdraw"){
            try{
            bank.withdraw(amount);
            // bank.getBal();
            } catch(BankException e){
                System.out.println(e.getMessage());
            }
        }
        else if(op=="deposite"){
            bank.deposite(amount);
            // bank.getBal();
        }
        else if(op=="balance"){
            bank.getBal();
        }
        else{
            System.out.println("wrong option");
        }
    }
    public void run(){
        disp();
    }

}