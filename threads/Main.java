package threads;

class A{
    void disp(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class Main {

    void show(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }


    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getId());
        A a=new A();
        a.disp();
        Main main=new Main();
        main.show();
    }    

}
