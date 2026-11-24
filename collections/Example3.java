package collections;


interface A{
    void disp();
    void show();
}

interface B{
    int add(int a , int b);
}

public class Example3 {
    public static void main(String[] args){
        A a = new A(){
            @Override
            public void show(){
                System.out.println("hello");
            }
            public void disp(){
                System.out.println("bye");
            }
        };
        B b = (a2, b2)-> a2+b2;
        int sum = b.add(2,8);
        System.out.println(sum);
    }
}
