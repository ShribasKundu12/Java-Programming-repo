//Traditional Switch-Case vs Enhanced Switch-Case

/*public class SwitchCaseDemo
{
    public static void main(String[] s)
    {
        int x=2,y=0;
        switch (x+y)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                //break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}*/

import java.util.Scanner;
//public class SwitchCaseDemoJava12_2
public class SwitchCaseDemo
{
    public static void main(String[] s)
    {
        int month=new Scanner(System.in).nextInt();
        switch (month)
        {
            case 1,3,5,7,8,10,12 ->System.out.println("31 Days");
            case 4,6,9,11 ->System.out.println("30 Days");
            case 2 ->System.out.println("28 Days");
            default->System.out.println("Invalid Month");
        }
    }
}