
//Java Program to Add two Complex Numbers

//(6 + 5i) + (6 + 9i) = 12 + 14i


package complexNum;

public class Complex {
	
	public static void main(String[] args) {
		
		int firstNoFirstVal = 6,firstNoSecondVal = 5;
		int secondNumFirstVal = 6, secondNumSecondVal = 9;
		
		int c = firstNoFirstVal + secondNumFirstVal;

		int d = firstNoSecondVal + secondNumSecondVal;
		
		System.out.println("Addition of complex no = "+c+" + "+d+"i");

	}

}
