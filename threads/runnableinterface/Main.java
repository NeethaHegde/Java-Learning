package threads.runnableinterface;

class A implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
             System.out.println(Thread.currentThread().getName());
        }
    }

}
class B implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

}


interface d{
    void show();
}
interface e{
    void show();
}
class C{
    public void show(){
        System.out.println("hello");
    }
}
public class Main {
    public static void main(String[] args){
        A a=new A();
        Runnable t1=new Thread(a);
        t1.run();    
        B b=new B();
        Thread t2=new Thread();
        t2.start();
    }  

}
