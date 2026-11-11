package constructorexample;

 class Student{
    String name ;
    int age ;

    Student(){
        System.out.println("Hello Students,");
    }

    Student(String name, int age){
        System.out.println("Student details");
        this.name = name;
        this.age = age;
    }
}
public class Example2 {
   
public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("Neetha",2);
    System.out.println(s2.name);
    System.out.println(s2.age);
}
}
