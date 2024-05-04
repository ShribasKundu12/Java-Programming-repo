//default constructor
class Constructor{
    int length,width;//instance variable
    //here length = 0 and width  = 0 initialized by default constructor
    void area(){
        int area = length * width;
        System.out.println("area  = "+area);
        //area = 0
    }
    void peri(){
        int peri = 2 *(length + width);
        System.out.println("perimeter  = "+peri);// perimeter = 0
    }
}
class Main{
    public static void main(String[] s){
        //jvm provides default constructor
        //depending on the data types instance variables are initialized by
        //the constructor by invoked itself automatically...
        Constructor obj  = new Constructor();
        //in java constructor name will be the name of the class
        obj.area();
        obj.peri();
    }
}