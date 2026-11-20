package threads.threadexample1;

class A extends Thread{
    public void run(){
    
        for(int i=1;i<=10;i++){
            try{
                Thread.sleep(100);
                
                System.out.println(Thread.currentThread().getName());
            }
            catch(InterruptedException e){
            System.out.println("Handle");
        }
           
    }
}
}
class B extends Thread{
    public void run(){
        
        
        for(int i=11;i<=20;i++){
             
                System.out.println(Thread.currentThread().getName());

           
    }
}
}
class C extends Thread{
    public void run(){
        
        for(int i=21;i<=50;i++){
             
                System.out.println(Thread.currentThread().getName());

            
            
           
    }
}
}

public class Main {
    public static void main(String[] args)throws InterruptedException{
        A a=new A();
        System.out.println(a.getState());
        a.start();
        System.out.println(a.getState());
        a.sleep(10000);
        System.out.println(a.getState());
        a.join();
        System.out.println(a.getState());

        //try{
           // c.start();
           // c.join();
           // a.start();
            //a.join();
           // b.start();
            //b.join();
       // }
        //catch(InterruptedException e){
           // System.out.println("Handle");
        //}

    }

}
