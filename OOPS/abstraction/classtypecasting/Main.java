package OOPS.abstraction.classtypecasting;


class A{
    void disp(){
        System.out.println("hello");
    }
}

class B extends A{
    void show(){
        System.out.println("Bye");
    }
}
public class Main {
    public static void main(String[] args) {

        //upcasting, done by both implicit and explicit
        B b = new B();
        A a = new A();
        a.disp();

        //down casting , without upcasting we cannot perform downcasting
        //done by explicit
        A a2 = new B();
        B b2 = (B) a2;
        b2.show();
        b2.disp();

    }
}
