
//java program factorial of a number
package factorial;
public class Fact {

	public static void main(String[] args) {
		int number = 6;
		int newNum;
		newNum = number;
		int val  = 1;
		
		for(int i = 1; i< newNum; i++) {
			val = val * number;//60
			number--;//2
			
		}
		System.out.println("Factorial of "+newNum+" = "+val);

	}

}
