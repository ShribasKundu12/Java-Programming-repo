import java.util.Scanner;
class CFS{
    public static void main(String[] s){
        Scanner inp = new Scanner(System.in);
        String str = inp.next();
        switch(str){
            case "one":
                System.out.println("January");
                break;
            case "two":
                System.out.println("February");
                break;
            default:
                System.out.println("Invalid option!!");
        }
    }
}