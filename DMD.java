//Dynamic method dispatch
class A{
    public void show(){
        System.out.println("called show in class A");
    }
}
//here class B is the subclass of Class A
class B extends A{
    public void show(){
        System.out.println("called show in class B");
    }
}
class C extends A{
    public void show(){
        System.out.println("called show in class C");
    }
}
public class DMD{
    public static void main(String[] s){
        A obj = new B();
        obj.show();
        //here reference var obj is A class type
        //but depending on the object creation show()
        //will class for class B

        obj = new A();
        obj.show();

        obj = new C();
        obj.show();

    }
}