package collections;

import java.util.*;
public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<Integer> i = new LinkedList<Integer>();
        i.add(1);
        i.add(2);
        i.add(3);

        i.addFirst(6);

        i.addLast(8);
        i.addLast(9);
        System.out.println(i);
        System.out.println("after removing the first element: "+ i.removeFirst());

        System.out.println(i);

    }
}
