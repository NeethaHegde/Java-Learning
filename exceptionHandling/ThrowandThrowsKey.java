package exceptionHandling;

public class ThrowandThrowsKey {
    
    public static void checkEven(int num){
        if(num%2==0){
            System.out.println("even number");
        }
        else{
            throw new ArithmeticException("Not even number");
        }
        
    }
    public static void main(String[] args){
        System.out.println("hello");
        try{
            checkEven(4);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }


    }
}
