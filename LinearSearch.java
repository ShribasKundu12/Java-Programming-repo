/* 1.WAP to take an array input from the user.
search for the given number X and print the index
at which the number occurs.
*/
import java.util.Scanner;
class DemoArray3{
  public static void main(String[] s){
      //declaring an array size will be provided by user
      //storing height of 10 soldiers
      System.out.println("Enter number of soldiers:");
      Scanner sc = new Scanner(System.in);
      int size  =  sc.nextInt();
      double[] height = new double[size];
      //input
      for(int i=0; i<size; i++) {
          height[i] = sc.nextDouble();
      }
      System.out.println("Enter a value to be search:");
      double x = sc.nextDouble();
      //print the index for the value
      for(int i=0; i<size; i++){
          if(x == height[i]) {
              System.out.println("index of the searched value is = " + i);
              break;
          }
      }
      System.out.println("Searching not found...");
  }
}

