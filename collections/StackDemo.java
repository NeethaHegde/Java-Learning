package collections;

import java.util.*;
public class StackDemo {
    public static void main(String[] args){
    Stack<Integer> s1 = new Stack<Integer>();
    s1.push(10);
    s1.push(30);
    s1.push(59);
    s1.push(68);
    s1.push(89);

    System.out.println(s1);

    
    System.out.println(s1.pop());
    
    System.out.println(s1.peek());
    }

}
