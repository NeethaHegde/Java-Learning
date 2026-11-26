package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee{
    String name;
    int id;


    public Employee( String name) {
        // this.id = id;
        this.name = name;
    
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + "]";
    }
}
public class ConstructorRefExample {
    public static void main(String[] args) {
        List <Employee> emp = new ArrayList<>();
        List<String> names = Arrays.asList("Raju", "Ravi", "Amith", "Karthik");


        for (String name : names) {
            emp.add(new Employee(name));
        }
        System.out.println(emp);

        System.out.println("Try with Stream Map");
         List <Employee> emp2 = new ArrayList<>();
         emp2 = names.stream().map(name->new Employee(name)).toList();
         System.out.println(emp2);

         System.out.println("Constructor ref");
         List <Employee> emp3 = new ArrayList<>();
         emp3 = names.stream().map(Employee::new ).toList();
         System.out.println(emp3);
         
    }
    
}
