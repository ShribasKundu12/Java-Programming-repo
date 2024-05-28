//Object_Class
//Object Class is the superclass among all
//classes in java...i.e, Object Class inherits
//all the other classes in java...
class Laptop{
    String model;
    int price;
    //suppose if we create a string type
    //method toString and print the reference variable
    //then output will be hello!!
    public String toString(){
        return model+"_"+price;
    }
    public boolean equals(Laptop that) {
        //using equals() for String and '=='
        //for int variable price
        if(this.model.equals(that.model) &&
        this.price == that.price){
            return true;
        }else {
            return false;
        }
    }
}
public class ObjClass {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model  = "HP";
        obj1.price = 60_000;

        System.out.println(obj1);//Laptop@1b28cdfa
        //toString() is used with obj in default manner
        //when toString () isn't defined by programmer
        System.out.println(obj1.toString());//Laptop@1b28cdfa

        Laptop obj2 = new Laptop();
        obj2.model  = "HP";
        obj2.price = 60_000;
        System.out.println(obj2);//HP_60000

        boolean bool = (obj2.equals(obj1));
        System.out.println(bool);//true

    }
}