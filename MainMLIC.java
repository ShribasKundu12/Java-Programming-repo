//method local inner class in java...
class A{
    int x = 5;//instance var of class A
    void abc(){
        int a=10;//local to abc()
        //method local inner class
        class AB{
            final int c = 10,d =20;// instance var for AB class
            //from jdk 1.8 non-final variables can be access
            //by method local inner class...
            public void pqr(){
                System.out.println("x = "+x);
                System.out.println("a = "+a);
                System.out.println("c+d = "+(c+d));
            }
        }
        final AB ab = new AB();
        ab.pqr();
    }
    void xyz(){
        class RST{
            final char ch = 'A';
            void print(){
                System.out.println("ch = "+ch);
            }
        }
        RST rst = new RST();
        rst.print();
    }
}
public class MainMLIC {
    public static void main(String[] args) {
        A obj = new A();
        obj.abc();
        obj.xyz();
    }
}