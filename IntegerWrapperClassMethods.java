package wrapperClasses;

public class IntegerWrapperClassMethods {

	public static void main(String[] args) {

//**********************************	Integer.valueOf(<int variable>)	***************************************************

		int primitiveInt1 = 10; // initialized primitiveInt to 10
		Integer integerObject1 = Integer.valueOf(primitiveInt1); // Converted primitive data to object
		System.out.println(integerObject1); // printing the output in console

//********************************	<IntegerObject>.intValue()		**************************************************

		Integer integerObject2 = 20; // Initialized Integer object as 20
		int primitiveInt2 = integerObject2.intValue(); // Converted Object to primitive
		System.out.println(primitiveInt2); // printed the output

//*********************************<IntegerObject>.getClass().getName()*************************************************

		// Print data type of Integer Object

		Class<?> integerObject1Class = integerObject1.getClass(); // It will create a Class object from the Integer
																	// object1
		System.out.println(integerObject1Class.getName()); // It will print the name of the Class object, which is
															// "java.lang.Integer"

		// or

		System.out.println(integerObject1.getClass().getName()); // single line solution without creating Object Class

//*********************************** Integer.parseInt() ******************************************************
		// Initialization of a string ( it should contain integer value in the form of
		// String )
		String str = "123";

		// Converting String to Integer
		Integer parsedStringToInt = Integer.parseInt(str);

		// Printing the converted output
		System.out.println(parsedStringToInt);

//*************************************	<IntegerObject1>.equals(IntegerObject1)	*****************************************************

		Integer num1 = 10;
		Integer num2 = 20;

		System.out.println(num1.equals(num2));

//*************************************	<IntegerObject1>.compareTo(IntegerObject1)	*****************************************************

		Integer num3 = 29;
		Integer num4 = 29;

		System.out.println(num3.compareTo(num4));

// Note:  equals compares the content of the variables like 10==20 and return boolean value
// compareTo converts values to Unicode values then subtract and will return +1 or 0 or -1
	}
}
