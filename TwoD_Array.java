
import java.util.*;
class Spiral{
    public static void main(String[] s){
        //creating a 2D array
        System.out.println("Enter row and column:");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] array_2d = new int[row][column];
        //input
        for(int i = 0; i<row; i++){
            for(int j=0; j<column; j++){
                array_2d[i][j] = sc.nextInt();
            }
            //System.out.println();
        }
        //output
        for(int i = 0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(array_2d[i][j]+" ");;
            }
            System.out.println();
        }
    }
}