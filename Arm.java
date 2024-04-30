
//java program to find Armstrong number
import java.util.Scanner;
public class Arm {
	
    static int countDigit(int x)
    {    
         int c;
         for(c=0;x>0;c++,x=x/10);
         return c;
    }
    static boolean isArmstrong(int x,int y)
    {
        int noOfDigit=countDigit(x);
        int s=0,d;
        while(y>0)
        {
             d=y%10;
             s+=Math.pow(d,noOfDigit);
             y=y/10;
        }
        if(s==x)
              return true;
        else
              return false;
   }
   public static void main(String[] s)
   {
     Scanner input =new Scanner(System.in);
     System.out.print("Enter the number for checking for armstrong number: ");
     int x = input.nextInt();
     int y;
     y = x;
     boolean k = isArmstrong(x,y);
     if(k==true)
         System.out.println("Armstrong number");
     else
         System.out.println("Not a Armstrong number");
   }

}
