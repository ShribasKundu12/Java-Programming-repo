//Print the spiral order matrix as output for a given matrix of numbers.
/*
input:
 1 2 3 4
 5 6 7 8
 7 8 9 6
 9 0 0 0
output:
 1 2 3 4 8 6 0 0 0 9 7 5 6 7 9 8
*/
import java.util.*;
class Spiral {
    public static void main(String[] s) {
        //creating a 2D array
        System.out.println("It is a square matrix!!");
        System.out.println("Enter row and column:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array_2d = new int[n][n];
        //input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array_2d[i][j] = sc.nextInt();
            }
            //System.out.println();
        }
        //required pointers
        int top = 0, left = 0, bottom = n-1, right = n-1;
        while(top <= bottom && left <= right){

            //for left to right
            for(int i=left; i<=right; i++){
                System.out.print(array_2d[top][i]);
            }
            top++;
            //for top to bottom
            for(int i=top; i<=bottom; i++){
                System.out.print(array_2d[i][right]);
            }
            right--;
            //for right to left
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    System.out.print(array_2d[bottom][i]);
                }
                bottom--;
            }
            //bottom to top
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    System.out.print(array_2d[i][left]);
                }
                left++;
            }
        }
    }
}