class DemoVLAM2{
    static void fun(int ...a) {

        System.out.println("Length of the array = "+a.length);
        System.out.println("Elements:");
        for(int i = 0 ; i< a.length; i++) {
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String[] s) {
        fun(100);//1 parameter
        fun(1,2,3,4);//4 parameter
        fun();//no parameter
    }
}