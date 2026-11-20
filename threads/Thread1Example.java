package threads;

public class Thread1Example {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch(InterruptedException e){
                System.out.println("handle");
            }
        }
    }

}
