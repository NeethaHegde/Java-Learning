package collections;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
        v.add(70);
        v.add(80);
        v.add(90);

        System.out.println(v);
        v.capacity();
        System.out.println(v);
        v.contains(20);
        System.out.println(v);
        v.removeFirst();
        System.out.println(v);

        for(int h:v){
            System.out.println(h);
        }
        v.clear();
        System.out.println(v);
    
    }
}
