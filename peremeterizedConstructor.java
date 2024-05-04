class Constructor{
    int length,width;//instance variable
    //i
    Constructor(int length, int width){
        //here this.length = instance var
        //length = local variable
        this.length = length;
        this.width = width;
    }
    void area(){
        int area = length * width;
        System.out.println("area  = "+area);

    }
    void peri(){
        int peri = 2 *(length + width);
        System.out.println("perimeter  = "+peri);
    }
}
class Main {
    public static void main(String[] s) {
        //jvm provides default constructor
        //depending on the data types instance variables are initialized by
        //the constructor by invoked itself automatically...
        //as soon as a constructor is being created explicitly by the programmer then jvm will stop to
        // provide default constructor...
        Constructor obj = new Constructor(10,20);//passing arguments through the constructor
        //by parameter
        //in java constructor name will be the name of the class
        obj.area();
        obj.peri();
    }
}