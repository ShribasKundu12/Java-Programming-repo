//an example that illustrates how a run-time 
//system searches for appropriate exception 
//handling code on the call stack.
package demo;
public class DemoException2 {	
	static int method2(int x,int y) {
		int val1 = 0;
		val1 = x/y;
		return val1;
	}	
	static int method1(int x,int y) {
		int val = 0;
		val = method2(x,y);
		return val;
	}
	public static void main(String[] args) {		
		int a,b;
		a=1;b=0;		
		try {			
			int r= method1(a,b);			
		}catch(Exception e) {
			System.out.println(e.toString());
		}

	}

}
