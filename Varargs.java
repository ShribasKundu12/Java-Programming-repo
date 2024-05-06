class DemoVLAM1{
    static boolean sum(int x, int ...a){//single integer data type
        int s = 0;
        System.out.println("sum = "+s);
        for( int i : a){
            if(x == i){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] s){
        boolean a = sum(110,67,89,11);
        if(a == true){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
//        sum(56,78);
//        sum(12);
//        sum(100,100,600);
    }
}