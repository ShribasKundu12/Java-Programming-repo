////java interface
//interface Polygon {
//    void getArea(int length, int breadth);
//}
//// implement the Polygon interface
//class Rectangle implements Polygon {
//
//    // implementation of abstract method
//    public void getArea(int length, int breadth) {
//        System.out.println("area of rectangle " +
//                (length * breadth));
//    }
//}
//class Demo {
//    public static void main(String[] args) {
//        Rectangle r1 = new Rectangle();
//        r1.getArea(50, 60);
//    }
//}
// create an interface
interface Language {
    void getName(String name);
}

// class implements interface
class ProgrammingLanguage implements Language {

    // implementation of abstract method
    public void getName(String name) {
        System.out.println("Programming Language: " + name);
    }
}

class Demo1 {
    public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("Java");
    }
}