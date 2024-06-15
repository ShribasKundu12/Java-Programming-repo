// Java program to demonstrate implementation of Singleton Classes
class MySingletonDemo
{
    static MySingletonDemo instance = null;
    public int x = 10;

    // private constructor can't be accessed outside the class
    private MySingletonDemo() { }

    // Factory method to provide the users with instances
    static public MySingletonDemo getInstance()
    {
        if (instance == null)
            instance = new MySingletonDemo();

        return instance;
    }
} 
class demoClass
{
    public static void main(String[]  args)
    {
        MySingletonDemo a = MySingletonDemo.getInstance();
        MySingletonDemo b = MySingletonDemo.getInstance();
        a.x = a.x + 10;
        System.out.println("Value of a.x = " + a.x);
        System.out.println("Value of b.x = " + b.x);
    }
}
