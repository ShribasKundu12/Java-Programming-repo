//Inner class in java
/*
 * If the inner class is static member of the outer class
 * then it is called nested class.
 *
 */
class A {//outer class
    String name = "java";
    static class B{//static inner class or nested class
        String name = "python";

        void print_name(){
            System.out.println("Name = "+this.name);
            //System.out.println("Name = "+A.this.name);
        }
    }
    public static void main(String []s){
        //process 1
        System.out.println("process 1");
        //Outer obj1 = new Outer();
        A.B obj1 = new A.B();
        obj1.print_name();
        //A$B .class file

        System.out.println("process 2");
        //process 2
        A.B obj = new A.B();
        obj.print_name();
        System.out.println("we will get same output but the process of creating object is different..");
    }
}

