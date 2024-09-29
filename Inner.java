//Inner class in java
/*
    * The inner class is member of the outer class
    * And it is non-static then it is class as inner class.
    *
    * If the inner class is static member of the outer class
    * then it is called nested class.
 */
class Outer {//outer class
    int val1 = 100;
    class Inner{//inner class
        int val1 = 400;
        //constructor of inner class
        void print_name(){
            System.out.println(this.val1);
            System.out.println(Outer.this.val1);
            System.out.println("sum = "+(this.val1+Outer.this.val1));
        }
    }
    public static void main(String []s){
        //process 1
        System.out.println("process 1");
        Outer obj1 = new Outer();
        Outer.Inner obj2 = obj1.new Inner();
        obj2.print_name();
        //Outer$Inner .class file

        System.out.println("process 2");
        //process 2
        Outer.Inner  obj = new Outer().new Inner();
        obj.print_name();
        System.out.println("we will get same output but the process of creating object is different..");
    }
}

