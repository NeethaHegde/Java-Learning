package constructorexample;

class Employee{
    int id = 1;
    String name = "Neetha";

    Employee(){
        System.out.println("Hello Constructor");
    }

    Employee(int id, String name){
        this.name = name;
        System.out.println("Hi, Constructor");
    }
}


public class Example1 {
  public static void main(String[] args) {
    Employee e = new Employee();
    System.out.println(e.name);

    Employee e1 = new Employee(1,"abc");
    System.out.println(e1.name);

    Employee e2 = new Employee();
    System.out.println(e2.name);



  }
}
