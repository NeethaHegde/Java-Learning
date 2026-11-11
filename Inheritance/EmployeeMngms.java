class Person{
    String name;
    int age;

    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Employee extends Person{
    int empid;
    double salary;

}

class Developer extends Employee{
   String programmingLanguage;

void writeCode() {
    System.out.println("Programming Language: " + programmingLanguage);
}
}
public class EmployeeMngms {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.name="Neetha";
        d.age=22;
        d.displayPerson();
        d.empid=1234;
        d.salary=50000;
        System.out.println("Employee ID: " + d.empid);
        System.out.println("Salary: " + d.salary);

        d.programmingLanguage="Java";
        d.writeCode();
    }
}
