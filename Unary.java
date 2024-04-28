class Unary{
    public static void main(String[] s){
        int a,b;
        a = 1;
        ++a;//first increment by 1 then assign
        a++;//first assign then increment by 1
        b = 1;
        b--;//first assign then decrement by 1
        --b;//first decrement by 1 then assign
        System.out.println("pre increment ++a = "+a);
        System.out.println("post increment a++ = "+a);
        System.out.println("pre decrement --b = "+b);
        System.out.println("post decrement b-- = "+b);
    }
}