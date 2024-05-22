// Java Program to demonstrate why
// Java Strings are immutable

class DemoStr {
    public static void main(String[] args)
    {
        String s1 = "java";
        s1.concat(" javaScript");

        // here, s1 still refers to "java"
        System.out.println("s1 refers to " + s1);
        //here output will be s1 refers to java
    }
}

