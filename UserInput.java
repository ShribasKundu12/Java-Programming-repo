import java.util.Scanner;//import the scanner class
class UserInput{
    static public void main(String[] s){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer value:");
        int val = input.nextInt();
        System.out.println("val = "+val);
    }
}