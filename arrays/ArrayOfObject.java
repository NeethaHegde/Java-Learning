package arrays;

class Employee{
    int id;
    String name;

    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String toString(){
        return "id="+id+"\n"+"name="+name;
    }

}

public class ArrayOfObject {
    public static void main(String[] args) {
        Employee arr[]={new Employee(1,"abc"),new Employee(2,"xyz")};
        System.out.println(arr[0]);
        System.out.println(arr[0].name);
        System.out.println(arr[1].id);
        System.out.println(arr[1].name);

    }

}
