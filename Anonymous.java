//anonymous object in java
    class Demo {
    public Demo() {
        System.out.println("within Demo class!");
    }

    void show() {
        System.out.println("I love java!");
    }
}
    public class Anonymous {
        public static void main(String[] args) {
            //anonymous object
            new Demo().show();

        }
    }