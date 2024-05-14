import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int row,col,data;
        System.out.println("Enter the row:");//2
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();//2
        int[][] arr =  new int[row][];
        //input for jagged array

        for(int i=0; i<row; i++){//0<2
            System.out.println("Enter number of column for row "+i);
            col = sc.nextInt();//2
            arr[i] = new int[col];
            for(int j=0; j<col; j++){
                System.out.println("Enter data for row "+i+" column "+j);
                data = sc.nextInt();
                arr[i][j]  = data;

            }
        }
        //output for jagged array
        for(int i=0; i<row; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
/*output:
 10 20
30 40 50
*/