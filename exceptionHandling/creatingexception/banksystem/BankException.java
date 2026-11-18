package exceptionHandling.creatingexception.banksystem;

public class BankException extends Exception {
    BankException(){

    }
    BankException(String msg){
        super(msg);
    }
}
