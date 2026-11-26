package streamapi;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;


public class OptionalClassExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raju", "Ravi", "Karthik", "Amit", "Priya");
    
        Optional <String> name = names.stream().filter(str->str.contains("Amith")).findFirst();
        System.out.println(name.orElse("no value"));

        String name2 = names.stream().filter(str->str.contains("Amit")).findFirst().orElse("no value presnet");
        System.out.println(name2);

    }
}
