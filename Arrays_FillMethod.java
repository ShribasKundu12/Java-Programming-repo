import java.util.*;
//'Arrays' class is under util package
public class Arrays_FillMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter max value:");
        int n = sc.nextInt();
        int []arr = new int[n];
        //initially Array is initialized with 0
        //by using Array.fill(BaseAddress,value-use-
        //as-an-initializer)
        System.out.println("Initially:");
        for(int i:arr){

            System.out.print(i);
        }
        System.out.println();
        System.out.println("using 2 as initializer:");
        Arrays.fill(arr,2);
        for(int k:arr){

            System.out.print(k);
        }
        System.out.println();
        int []arr1 = new int[Integer.MAX_VALUE];
        //Exception in thread "main"
        // java.lang.OutOfMemoryError:
        // Requested array size exceeds VM limit
        System.out.println(arr1.length);//2^31

    }
}