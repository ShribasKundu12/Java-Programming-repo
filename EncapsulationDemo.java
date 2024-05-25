//Encapsulation in java
class Capsul{
    //by using name and age as private we can use it
    //only within the Capsul class
    private String name;
    private int age;
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Capsul cap = new Capsul();
        cap.setAge(19);
        cap.setName("xyz");
        System.out.println(cap.getAge() +" "+cap.getName());
        //19 xyz - output

    }
}