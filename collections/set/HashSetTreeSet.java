package collections.set;

import java.util.*;

public class HashSetTreeSet {
    public static void main(String args[]){
        Set<Integer> s = new HashSet<>();
        s.add(23);
        s.add(34);
        s.add(89);
        s.add(56);
        s.add(null);

        System.out.println(s);

        Set<Integer> s1 = new TreeSet<>();
        s1.add(23);
        s1.add(34);
        s1.add(89);
        s1.add(56);
        

        System.out.println(s1);
    }

}
