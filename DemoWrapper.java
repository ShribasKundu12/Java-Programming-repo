/*//Details in Wrapper class in Java
//In java there are 8 wrapper class
//utility of wrapper class is that->
//    we can make an object of wrapper class
//     and use it with method()
import java.util.Scanner;
class Wrapper{
    String colorA = "Blue";
    String colorB = "Yellow";
    String mixedColor(){
        String colorC = "Green";
        System.out.println("By mixing "+colorA+" With "+colorB+" we get "+colorC);
        return colorC;
    }
}
public class DemoWrapper {

    public static void main(String[] s){
        Scanner sc = new Scanner(System.in);
        Wrapper wrap = new Wrapper();
        System.out.println("By mixing yellow + blue = ?");
        String input = sc.next();
        String colC = wrap.mixedColor();
        //String colD = wrap.mixedColor();
        //wrap.mixedColor();
        //we can change the arguments by own wish...
        if((colC).equals(input))
            System.out.println("user provides the correct answer!");
    }
}*/
import java.io.*;
class Main{
    public static void main(String[] s){
        int value =10;
        Integer i = new Integer(value);//Autoboxing
            System.out.println(i);
    }
}