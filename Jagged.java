//Jagged array
//In the concepts of 2-D array there might have some loopholes
//such as, 2-D array is memory In-efficient...
//Suppose if in a 2-D array row size is given and column size isn't
//same... so for that different column size memory will be wasted, hence
//Jagged array arrives from the concepts of array of arrays

//for exp:-
class DemoJagged{
    public static void main(String[] s){
        //Jagged Array:-
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[1];

        arr[0][0] = 45;
        arr[0][1] = 55;

        arr[1][0] = 65;
        arr[1][1] = 75;
        arr[1][2] = 85;

        arr[2][0] = 95;
        System.out.println(arr[0][0]);
        System.out.println(arr[2][0]);
    }
}