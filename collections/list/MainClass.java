package collections.list;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        List <Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(l);

        List<Integer> even = new ArrayList<>();

        for(int i=0; i<l.size(); i++){
            if(l.get(i)%2 == 0){
               even.add(l.get(i));
            }
        }
       for(Integer j:even){
        System.out.println(j);
       }
    }

}
