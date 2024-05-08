class Student
{
    String name,address;
    int age,roll;
    Student(String name, String address)
    {
        this();
        this.name=name;
        this.address=address;
        System.out.println("Constructor with TWO String");
    }
    Student(String n, String add, int a, int r)
    {
        this(n,add);//Will call another Constructor of same class which accepts TWO Strings
        age=a;
        roll=r;
        System.out.println("Constructor with TWO String & TWO int");
    }
    Student()//EMPTY Constructor
    {
        System.out.println("Constructor without Parameter");
    }
    Student(int a, int r)
    {
        age=a;
        roll=r;
        System.out.println("Constructor with TWO int");
    }

}
class ConstructorChaining1
{
    public static void main(String s[])
    {
        Student s1=new Student("Avi","Gurgaon", 21, 74);
    }
}

