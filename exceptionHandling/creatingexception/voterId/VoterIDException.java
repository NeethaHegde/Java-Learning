package exceptionHandling.creatingexception.voterId;

public class VoterIDException extends Exception{
    String msg;

    VoterIDException(){

    }

    public VoterIDException(String msg) {
       this.msg = msg;

    }
    
    public String getMessage(){
        return msg;
    }
}
