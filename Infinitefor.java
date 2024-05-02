import java.util.Scanner;
class Inf{
    public static void main(String[] s){

        //infinite for loop condition
        for(;;){
            System.out.print("Enter any double number within 0.0 - 10.1:");
            Scanner inp = new Scanner(System.in);
            double val = inp.nextDouble();
           if(val  == 0.0)
                break;
        }
    }
}