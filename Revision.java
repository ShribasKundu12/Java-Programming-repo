//revision on some java topics
//varargs, this keyword;
// Java program to demonstrate varargs

class Test1 {
    // A method that takes variable
    // number of integer arguments.
    static void fun(int... a)
    {
        System.out.println("Number of arguments: "
                + a.length);

        // using for each loop to display contents of a
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
     public static void main(String[] s)
    {
        // Calling the varargs method with
        // different number of parameters

        // one parameter
        fun(100);
        // four parameters
        fun(1, 2, 3, 4);
        // no parameter
        fun();
    }
}
//this keyword
// Java code for using 'this' keyword to
// refer current class instance variables
class Test {
    int a;
    int b;

    // Parameterized constructor
    Test(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    void display()
    {
        // Displaying value of variables a and b
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args)
    {
        Test object = new Test(10, 20);
        object.display();
    }
}


