class Bitwise{
    public static void main(String[] s){
        //binary literal
        int a = 0B101;
        int b = 0B111;
        System.out.println(a);//5
        System.out.println(Integer.toBinaryString(a));//101
        System.out.println(b);//8
        System.out.println(Integer.toBinaryString(b));//1000
        int c = (a & b);
        int d = (a | b);
        int e = (a ^ b);
        System.out.println("a & b = "+c);//8
        System.out.println("a | b = "+d);//14
        System.out.println("a ^ b = "+e);//6
        System.out.println("~a = "+(~a));//5
        System.out.println("1010 & 1100 = "+Integer.toBinaryString(c));
        System.out.println("1010 | 1100 = "+Integer.toBinaryString(d));
        System.out.println("1010 ^ 1100 = "+Integer.toBinaryString(e));
        System.out.println("~1010 = "+Integer.toBinaryString(~a));
    }
}