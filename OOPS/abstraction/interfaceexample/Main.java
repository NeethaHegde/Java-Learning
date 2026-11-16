package OOPS.abstraction.interfaceexample;

interface A{
    void show(); // by defualt public abstract void show
    int a = 10; // by default public static int a=10

}
class B implements A{
    public void show(){
        System.out.println("Hello");
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.show();

        System.out.println(A.a);
    }
}


