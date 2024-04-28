class Assignment{
    public static void main(String[] s){
        int a = 10, b = 20;

        System.out.println("a = 10 , b = 20");
        //System.out.println();
        int res = a + b;
        System.out.println("a + b = "+res);//30

        a += 10;//a = a + 10
        System.out.println(a);//20

        a -= 10;//a = a - 10
        System.out.println(a);//10

        a *= 10;//a = a + 10
        System.out.println(a);//100

        a /= 10;//a = a + 10
        System.out.println(a);//10

        a %= 10;//a = a + 10
        System.out.println(a);//0
    }
}