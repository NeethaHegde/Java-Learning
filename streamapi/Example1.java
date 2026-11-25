package streamapi;

import java.util.*;
import java.util.stream.Stream;

import java.util.function.*;
public class Example1 {
  
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list);

        // List<Integer> even = new ArrayList<>();

    //     for(int i=0; i<l.size(); i++){
    //         if(l.get(i)%2 == 0){
    //            even.add(l.get(i));
    //         }
    //     }
    //    for(Integer j:even){
    //     System.out.println(j);
    //    }

    Stream<Integer> stream = list.stream();
    //anonymus class
    Predicate<Integer> predicate = new Predicate<Integer> (){
        public boolean test(Integer n){
            if(n%2 ==0){
                return true;
            } else {
                return false;
            }
        }
    };

    //lamda
    Predicate<Integer> predicate2 = (Integer n)->{
        if(n%2 == 0){
            return true;
        } else {
            return false;
        }
    };
    // single line
    Predicate<Integer> predicate3 = (n)->n%2==0?true:false;
    List<Integer> list2 = stream.filter(n->n%2==0?true:false).toList();
    System.out.println(list2);
    }

}

