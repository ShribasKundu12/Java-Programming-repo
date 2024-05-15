// An array is an object in java
//If a class is present then we can create
// an object for that class...but in case of array
//where is the class?
//During execution a temporary class is being created
//after execution it will be released
public class Program3 {
    public static void main(String[] args) {
        int[] arr  = new int[5];
        System.out.println("Name of the temporary class : "+arr.getClass().getName());
        //[I  ->for int type array
        double[] arr1  = new double[5];
        System.out.println("Name of the temporary class : "+arr1.getClass().getName());
        //[D  ->for double type array
    }
}