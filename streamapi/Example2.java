package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        int size = 10;
        List<Integer> list = new ArrayList<>(size);
        Random rand  = new Random();
        for(int i=1; i<size; i++){
            list.add(rand.nextInt(10));
        }
        System.out.println(list);

        //Normal Stream
        long normstart = System. currentTimeMillis();
        int sum = list.stream().filter(n->n%2==0).map(n->{
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }return n*2;
        }).mapToInt(n->n).sum();
        System.out.println(sum);
        long normend = System.currentTimeMillis();

        //Parallel Stream
        long parastart = System.currentTimeMillis();
        int sum2 = list.stream().filter(n->n%2==0).map(n->{
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }return n*2;
        }).mapToInt(n->n).sum();
        System.out.println(sum2);
        long paraend = System.currentTimeMillis();

        System.out.println("Normal stream time: " +(normstart - normend));
        System.out.println("Parallel Stream: "+ (paraend - parastart));
    }
}
