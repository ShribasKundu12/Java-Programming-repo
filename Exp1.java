package instanceofexample;

class Book{
	
}
public class Exp1 {
	public static void main(String[] args) {
	
		Book b = new Book();
	
		if(b instanceof Book) {
		System.out.println("b is type of book");
		}	
	}
}
//output:b is type of book

