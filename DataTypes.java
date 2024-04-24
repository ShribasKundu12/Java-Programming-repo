/*
Data types and variables in java

Data types: In java a data type specifies the type of data that can be
	    store in a variable.It may be Integer type or double type...

Data type have two types -> 	1.Primitive: boolean, char, int, short, byte, long, float, and double			       		2.Non-primitive: It's also known as object data types or user defined 				  	 data types such as String, Array, etc.	

Variables: Variables are such type of containers where different types of values can be stored.

Syntax: dataType variableName = value;
exp:    int      container  = 10;
*/

//Day02OfJavaProgramming

//primitive data types
public class DataTypes{
	public static void main(String[] agrs){
		byte byteTypeVal = 126;//Stores whole numbers from -128 to 127
		short shortTypeVal = -32_767;//Stores whole numbers from -32,768 to 32,767
		int intTypeVal = 100;//4 byte
		long longTypeVal = 12121;//8 byte
		float floatTypeVal = 12.78f;//4 byte
		double doubleTypeVal = 134.89;//8 byte
		char charTypeVal = 'S';//Stores a single character/letter or ASCII values
		boolean boolTypeVal = true;//store true or false only 

		//print
		System.out.println("byte: " + byteTypeVal);
        	System.out.println("short: " + shortTypeVal);
        	System.out.println("int: " + intTypeVal);
        	System.out.println("long: " + longTypeVal);
        	System.out.println("float: " + floatTypeVal);
        	System.out.println("double: " + doubleTypeVal);
        	System.out.println("char: " + charTypeVal);
		System.out.println("boolean: " + boolTypeVal);
	}
	
}