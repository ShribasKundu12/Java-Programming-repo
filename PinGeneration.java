//java program to generate a 4 digit OTP
import java.util.Scanner;
public class PinGeneration {
    /*
    * 1 2 3
    * 4 5 6
    * 7 8 9
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for 2D array having 3 row 3 column ");
        int [][]arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your 4 digit OTP is ");
        int max;
        max = arr[0][0];
        for(int i=0;i<arr.length;i++){
          for (int j = 0; j < arr[i].length; j++) {
              if (arr[i][j] > max)
                  max = arr[i][j];
          }
        }
        System.out.print(max);

        int []min = new int[4];
        for (int k = 0,j=0; k < min.length-1; k++,j++) {
            min[k] = arr[0][j];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] < min[k]) {
                    min[k] = arr[i][j];
                }
            }
            System.out.print(min[k]);
        }
    }
}