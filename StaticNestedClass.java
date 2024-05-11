class Color{
    static class Red{
        public void display(){
            System.out.println("Within Red class!");
        }
    }
    static class Orange{
        public void display(){
            System.out.println("Within Orange class");
        }
    }
    class White{
        public void display(){
            System.out.println("Within white class");
        }
    }
}
class Main{
    public static void main(String[] s){
        //creating obj for Color class
        Color color = new Color();
        //obj creation for static nested class
        Color.Red red = new Color.Red();
        red.display();
        Color.Orange org = new Color.Orange();
        org.display();
        //obj creation for non-static class
        Color.White white = color.new White();
        white.display();
    }
}