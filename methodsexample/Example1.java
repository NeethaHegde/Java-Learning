package methodsexample;

public class Example1 {

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static void mul(){
        System.out.println(2*3);
    }

    public static int div(){
        return 10/2;
    }
    public static void main(String[] args) {
        add(2,5);
        System.out.println(sum(2,5));
        mul();
        System.out.println(div());
    }
}
