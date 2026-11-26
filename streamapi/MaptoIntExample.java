package streamapi;

import java.util.*;

public class MaptoIntExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,45,34);
        int sum = list.stream().map(n->n*2).reduce(0, (a,b)->a+b);
        System.out.println(sum);

        int sum2 = list.stream().map(n->n*2).mapToInt(n->n).sum();
        System.out.println(sum2);

    }
}
