package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        int size = 100;
        List<Integer> list = new ArrayList<>(size);
        Random rand = new Random();
        for(int i=1; i<size; i++){
            list.add(rand.nextInt(100));
        }
        // System.out.println(list);

        //Normal Stream 
        long startStream = System.currentTimeMillis();
        int sum = list.stream().
        map(n->{
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            } return n*2;
        }).mapToInt(n->n).sum();
        System.out.println("Normal Stream: "+sum);
        long endStream = System.currentTimeMillis();


        //Parallel Stream
        long parastart = System.currentTimeMillis();
        int sum2 = list.parallelStream().
        map(n->{
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            } return n*2;
        }).mapToInt(n->n).sum();
        System.out.println("Parallel Stream: "+sum2);
        long paraend = System.currentTimeMillis();

        System.out.println("Normal stream time: " +(endStream - startStream));
        System.out.println("Parallel Stream: "+ (paraend - parastart));

        

    }
}
