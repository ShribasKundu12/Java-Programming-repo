class Fruit{
    //declare a variable with public modifier
    public String fruitName ;
    public void taste(){
        fruitName = "Mango";
        System.out.println(fruitName+" tastes sweet");
    }
}

public class PublicModifier{
    public static void main(String[] s){
        Fruit f = new Fruit();
        f.taste();
    }
}