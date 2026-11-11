package staticandnonstatic;

   class Employee{
        static int salary = 20000;
        public static void details(){
            System.out.println("Employee details");
        }
    }
public class StaticExample {
    public static void main(String[] args) {
        Employee.details();
        int sal = Employee.salary;
        System.out.println(sal);
        }
}
