
//"this" keyword can be passed as an argument to a method that
//again refers to the current instance
//for example:
class DemoThis3 {
    int length, width, height;
    void volume(DemoThis3 obj) {
        int res = obj.length * obj.width * obj.height;
        System.out.println("Volume of a rectangle = "+res);
        //System.out.println(obj);
    }
    void callVolume(){
        //passing this as an argument
        volume(this);
    }
}

class DemoThisKey{
    public static void main(String[] s){
        DemoThis3 obj1 = new DemoThis3();
        DemoThis3 obj2 = new DemoThis3();
        obj1.callVolume();
        //System.out.println(obj1);
        obj2.callVolume();
        //System.out.println(obj2);
    }
}