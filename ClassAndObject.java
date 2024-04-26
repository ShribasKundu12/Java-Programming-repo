class DemoClass{
    int a = 10;
    void print() {
        System.out.println("Within DemoClass");
    }
}
class Main{
    public static void main(String[] s){
        DemoClass obj = new DemoClass();//here Democlass is the class name
        //obj is the reference variable(DemoClass type) it contains the address of the object
        //'new' allocates memory for object
        //DemoClass() is constructor
        int x = obj.a;
        obj.print();
        System.out.println("x = "+x);
        System.out.println("Within Main class");
    }
}
