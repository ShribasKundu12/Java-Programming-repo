//Array in java programming language
// Java program to illustrate creating an array
class DemoArray {
    public static void main(String[] args)
    {
        // declaring an int type array.
        int[] arr;
        // allocating memory for 4 integers.
        arr = new int[4];

        // initialize the first elements of the array
        arr[0] = 10;

        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i
                    + " : " + arr[i]);
    }
}




