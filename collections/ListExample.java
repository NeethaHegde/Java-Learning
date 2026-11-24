package collections;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(12);
        list.add(35);
        list.add("hello");
        list.add("35");
        list.add(true);
        list.add(3.56);
        list.add('A');

        System.out.println(Integer.valueOf(35));
        list.remove("35");

        System.out.println(list.remove("hello"));

        System.out.println(list);
        System.out.println();

        List<Integer> list2 = Arrays.asList(12,45,78,89,23,45,67,76,90);
        // System.out.println(list2);
        // Comparator<Integer> com = new Comparator<>() {
        //     public int compare(Integer a, Integer b){
        //         if(a%10 > b%10){
        //             return -1;
        //         }else if(a%10 < b%10){
        //             return 1;
        //         }else{
        //             return 0;
        //         }
        //     }
        // };
        // Collections.sort(list2, com);
        // System.out.println("sorted with second digit: "+list2);


        //Lamda expression
        Collections.sort(list2, (a2,b2)->a2%10 > b2%10 ? -1 : 1);
        System.out.println("sorted with second digit: "+list2);
        
    }
}
