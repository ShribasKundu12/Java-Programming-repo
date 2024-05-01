import java.util.Scanner;
class CFS{
    public static void main(String[] s){
        System.out.println("\t\t\t MENU");
        System.out.println("1 : + (Addition) ");
        System.out.println("2 : - (Subtraction) ");
        System.out.println("3 : * (Multiplication) ");
        System.out.println("4 : / (Division) ");
        System.out.println("5 : % (Modulo or remainder) ");
        Scanner inp = new Scanner(System.in);
        System.out.format("Enter your choice:");
        int choice = inp.nextInt();
        int add,sub,mul,div,modulo;
        System.out.print("Enter two integer value:");
        int a = inp.nextInt();
        int b = inp.nextInt();
        //using switch-case
        switch(choice){
            case 1:
                add = a + b;
                System.out.println("Summation = "+add);
                break;
            case 2:
                sub = a + b;
                System.out.println("Subtraction = "+sub);
                break;
            case 3:
                mul = a + b;
                System.out.println("Multiplication = "+mul);
                break;
            case 4:
                div = a / b;
                System.out.println("Division = "+div);
                break;
            case 5:
                modulo = a % b;
                System.out.println("modulus = "+modulo);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}