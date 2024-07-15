//Exception Handling in java
//When Run time error occurs in java
//to handle that error exception handling
//is required
package demo;
//import java.io.*;
public class DemoException {

	public static void main(String[] args) {
		
		int n1,n2;
		n1 =10;
		n2=0;
		//System.out.println(n1/n2);
		//Exception in thread "main"
		//java.lang.ArithmeticException: / by zero
		//at demo.Exception.main(Exception.java:14)
		try {
			int res = n1/n2;
			
		}catch(ArithmeticException err) {
			System.out.println("Something Wents Wrong!!");
		}
		
		System.out.println("Bye!!");
	}

}
