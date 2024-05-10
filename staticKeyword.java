//STATIC KEYWORD
//The static keyword in Java is mainly used for memory management
/*
 * static block
 * static variable
 * static method
 * static class(nested class)
 */
//java program to demonstrate static block
// Java program to demonstrate use of static blocks
/*
class StaticBlock{
    // static block
    //at the time of compilation when .class file is being loaded through
    //ClassLoader class in JVM runtime data area static block is going to be
    //initialized...it is very obvious that the initialization of static block
    //will be before the execution of main method in java
    static {
        int a=10,b;
        System.out.println("Within static block!!");
        b = a * 4;
        System.out.println("b = "+b);
    }
    public static void main(String[] args)
    {
        System.out.println("from main");
    }
}*/
//Can we print something on the console without creating main() method?
//we can print if we are using JDK version 1.6 or previous and
// if after that  it will throw an. error.

//static variable
class DemoStatic{
    //static variable
    static int val1=0,val2=1,temp;
    void fun(){
        temp  = val1;
        val1 = val2;
        val2 = temp;
        System.out.println(val1+" "+val2);
    }
    public static void main(String[] s){
        DemoStatic obj = new DemoStatic();
        //we can access static variables using class name
        System.out.println(DemoStatic.val1);
        System.out.println(DemoStatic.val2);
        obj.fun();
    }
}






