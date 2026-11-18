package arrays;

public class ObjectArrays {
    
    public static void sum2dArray(){
        int sum=0;
        int arr[][]={{23,4,55},{34,54,56}};
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println("Sum of 2d array : " +sum);
    }

    public static void sumArray(){
        int arr[]={12,23,433,44,54,63};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.println("Sum of array : " +sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(arr[2][0]);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.err.println(arr[i][j]);

            }
            System.out.println();
            
        }
        sumArray();
        sum2dArray();

    }
}
