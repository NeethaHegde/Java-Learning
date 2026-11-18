package arrays;

public class Main {
     public static void main(String[] args) {
        int arr[]={1,2,3,'a','b'};
        System.out.println(arr[3]);
        arr[4]=72;
        System.out.println(arr[4]);


        int arr2[]=new int[4];
        arr2[0]=2;
        arr[1]=3;
        arr[2]=4;
        arr[3]=5;

        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr2[i]);
        }
    
    }
}
