//how are java objects stored in memory?

//1.By String literal
//2.By new keyword

//by using String literal

/*class Memo {

	// class contents
	void show()
	{
		System.out.println("Test::show() called");
	}
}
public class Memory {

	// Driver Code
	public static void main(String[] args) 
	{
		Memo t; 
		
		// Error here because t 
		// is not initialized
		t.show(); 
	}
}*/

//by using new keyword
class Memo {
	
// class contents
	void show() 
	{
		System.out.println("Test::show() called");
	}
}

public class Memory {
	
	// Driver Code
	public static void main(String[] args)
	{
		
		// all objects are dynamically 
		// allocated
		Memo m = new Memo(); 
		m.show(); // No error 
	}
}
