//static method in java
//Demonstrate a java code using static method
class DemoStatic{
    String name;
    int age;
    static String clgName;
    void myInfo(String name,int age){//non-static method
        this.name = name;
        this.age = age;
        System.out.println("Name = "+this.name);
        System.out.println("Age = "+this.age);
    }
    public static void demoClg(String clg_name){//static method
        clgName = clg_name;//can use static variable within
        //static method
        System.out.println("College name: "+clgName);
    }
    public static void main(String[] s){
        demoClg("AEC");//static method can be accessed within another
        //static method
        //myInfo("shriv",19);//here we can't access the method without creating
        //object...hence it will be a compilation error
        //so that we have to create an object for that later we will be able
        // to access that method
        DemoStatic obj = new DemoStatic();
        obj.myInfo("Shriv",19);
    }
}