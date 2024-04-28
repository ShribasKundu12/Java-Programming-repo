//Compound assignment operator is applicable for all primitive data types except Boolean data type
/*
1.    += (compound addition assignment operator)
2.    -=  (compound subtraction assignment operator)
3.    *= (compound multiplication assignment operator)
4.    /= (compound division assignment operator)
5.    %= (compound modulo assignment operator)
6.    &= (compound Bitwise & assignment operator)
7.    |= (compound Bitwise | assignment operator)
8.    ^= (compound Bitwise ^ assignment operator)
9.    >>= (compound right-shift assignment operator)
10.   >>>=(compound right-shift filled 0 assignment operator)
11.   <<=(compound left-shift assignment operator)
*/

public class Operator{
	public static void main(String args[]){
		byte b = 0;
		short s = 20;
		int i = 40;
		long l = 30;
		char ch = 'A';
		float f = 10.1f;
		double d =10.22;
		b += 10;
		s += 10;
		i += 10;
		l += 10;
		ch += 10;
		f += 10;
		d += 10;
		System.out.println("b = "+b);//10
		System.out.println("s = "+s);//30
		System.out.println("i = "+i);//50
		System.out.println("L = "+l);//40
		System.out.println("ch = "+ch);//K
		System.out.println("f = "+f);//20.1
		System.out.println("d = "+d);//20.22
	}
}