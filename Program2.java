public class Program2 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        //here arr[] is the reference variable of int type array,
        //i.e, it can store reference of an int type array
        System.out.println(arr.length);//5
        int arr1[]  =new int[-6];//negative array size
        System.out.println(arr.length);//NegativeArraySizeException error
    }
}