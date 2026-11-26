package streamapi;

import java.util.Arrays;
import java.util.List;


public class MethodRefExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raju", "Ravi", "Karthik", "Amit", "Priya");
        
        //Method Reference
        List <String> name = names.stream().map(String::toLowerCase).toList();
        System.out.println(name);

        List <String> name2 = names.stream().map(String::toUpperCase).toList();
        System.out.println(name2);
    }
}
