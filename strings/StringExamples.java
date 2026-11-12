package strings;

class Employee{
    int id = 1;
    String name = "abc";
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "id= "+id+"\n" + "name =" +name;
        // return "hello";
    }

    public int hashCode(){
        return 123;
    }
}

public class StringExamples {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "abc");
        System.out.println(emp.toString());
        System.out.println(emp);
        System.out.println(emp.hashCode());
    }
}
