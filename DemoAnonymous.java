//Anonymous inner class in java...
class DemoAnonymous {
    void func1(){
        System.out.println("learning java");
    }
}
class Anonymous extends DemoAnonymous{
    DemoAnonymous obj = new DemoAnonymous();
    //here obj is instance variable of Anonymous class
    DemoAnonymous obj2 = new DemoAnonymous(){
        void func1() {
            System.out.println("Let's have some coffee..");
        }
    };
    void func2(){
        System.out.println("obj is the object of "+obj.getClass().getName());
        System.out.println("obj2 is the object of "+obj2.getClass().getName());
        obj2.func1();
    }
}
class MainClass{
    public static void main(String []s){
        Anonymous obj1 = new Anonymous();
        obj1.func2();
        DemoAnonymous obj3 = new DemoAnonymous();
        obj3.func1();
    }
}

