
import java.util.Scanner;
class Relational{
    public static void main(String[] s){
        int age;
        String str = "Shri";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age:");
        age = input.nextInt();
        System.out.println("Enter name:");
        String name = input.next();

        if(age == 18){
            System.out.println("You are "+age+" years old!");
        }else if(age <= 18){
            System.out.println("You are below 18, so you can't give vote");
        }else if(name.equals(str)){//here equals method is used to make relation between to String type variable
            System.out.println("Your name is "+str);
        }else{
            System.out.println("Better luck next time!");
        }
    }
}