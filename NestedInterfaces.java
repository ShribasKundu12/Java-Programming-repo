// Java program to demonstrate working of
// interface inside a class.
class Test {
    interface Yes {
        void show();
    }
}
class Testing implements Test.Yes {
    public void show()
    {
        System.out.println("show method of interface");
    }
}
class A {
    public static void main(String[] args)
    {
        Test.Yes obj;
        Testing test = new Testing();
        obj = test;
        obj.show();
    }
}
