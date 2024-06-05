//Abstract and anonymous inner class
abstract class A{
    public abstract void show();
}
//class B extends A{
//    public void show(){
//        System.out.println("in class B");
//    }
//}
public class AbsAnonymousInnerClass {
    public static void main(String[] s) {
        //if we want to use the abstract class once
        //then we can use an anonymous inner class
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
        //in new show
    }
}