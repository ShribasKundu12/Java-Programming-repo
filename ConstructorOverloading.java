//constructor overloading in java
import static java.lang.Math.pow;
class DemoCO{
    //declaring instance variable
    int radiusOfCircle;
    double areaOfCircle;
    double areaOfRect, length, width;
    //using final keyword means can't modify the value of pi
    //if declared as an instance variable
    final double pi = 3.14;
    //declaring overloading constructor
    DemoCO(int radius){
        radiusOfCircle = radius;
    }
    DemoCO(double l, double w){
        length = l;
        width  = w;
    }
    void circleArea(){
        areaOfCircle = pi * Math.pow(radiusOfCircle,2);
        System.out.println("Area of circle = "+areaOfCircle);
    }
    void rectArea(){
        areaOfRect = length * width;
        System.out.println("Area of rectangle = "+areaOfRect);
    }
}
class CO{
    public static void main(String[] s){
        DemoCO obj1  = new DemoCO(6);
        DemoCO obj2 = new DemoCO(15.5,5.6);
        obj2.rectArea();
        obj1.circleArea();
    }
}