package staticandnonstatic;

public class StaticNonStatic {
    int a = 10;
    static int b=20;

    public static void eg1(){
        System.out.println(b);
    }

    public void eg2(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        eg1();
        new StaticNonStatic().eg2(); 
        
    }
}
