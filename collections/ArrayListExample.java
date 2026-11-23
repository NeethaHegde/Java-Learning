package collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("Ravi");
        s.add("Priya");
        s.add("Kiran");
        s.add("Sneha");
        s.add("Arun");

        System.out.println("students: "+s);

        //get() - access element
        System.out.println(s.get(1));

        //set() - update
        s.set(3, "Rohan");
        System.out.println(s);

        //remove
        s.remove("Ravi");
        System.out.println(s);
        
        System.out.println(s.size());

    }

}
