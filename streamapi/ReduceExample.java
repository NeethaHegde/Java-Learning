package streamapi;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,4);
        Stream<Integer> stream = list.stream();
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<>() {
            public Integer apply(Integer a, Integer b){
                return a+b;
            }
        };
        

        BinaryOperator<Integer> binaryOperator2 =(a,b)->a+b;
        // int sum = stream.reduce(0, binaryOperator2);
        int sum2 = stream.reduce(0, (a,b)->a+b);
        System.out.println(sum2);
            
        Consumer<Integer> consumer = new Consumer<>() {
            public void accept(Integer a){
                System.out.println(a);
            }
        };

        Consumer<Integer> consumer2 = (a)->System.err.println(a);
        list.forEach(consumer);

        int sum3 = list.stream().filter(n->n%2==0).map(n->n*n).reduce(0,(a,b)->a+b);
        System.out.println(sum3);
        }

    }
