//Methods to print the Exception information
//1.printStackTrace()
//2.toString()
//getMessage()
package demo;
public class DemoException1 {

	public static void main(String[] args) {
		int []arr = new int[]{10,40,60,80,30,60};
		System.out.println("Array length = "+arr.length);
		
		int len = arr.length;
		len = len+1;
		//error line
		/*Exception in thread "main" Array length = 6
		java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 6
		at demo.DemoException1.main(DemoException1.java:14)*/
		System.out.println("Method no #1:");
		try{
			System.out.println("Value at"+len+"th Index = "+ arr[len]);
		}catch(Exception e) {
			//printStacktrace() to print exception
			//info.
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		System.out.println("End of code 1!");			
	}

}
