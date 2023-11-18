package wrapperClasses;

public class IntegerWrapperClass {

	public static void main(String[] args) {
		// Converting int ( primitive data ) to Integer ( object )

		int primitiveInt1 = 10; // initialized primitiveInt to 10
		Integer integerObject1 = Integer.valueOf(primitiveInt1); // Converted primitive data to object
		System.out.println(integerObject1); // printing the output in console

		// Converting Integer ( object ) to int ( primitive data )

		Integer integerObject2 = 20; // Initialized Integer object as 20
		int primitiveInt2 = integerObject2.intValue(); // Converted Object to primitive
		System.out.println(primitiveInt2); // printed the output

	}
}
