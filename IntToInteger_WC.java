package wrapperClasses;

public class IntToInteger_WC {

	public static void main(String[] args) {
		// Converting int ( primitive data ) to Integer ( object )

		int primitiveInt1 = 10; // initialized primitiveInt to 10
		Integer integerObject1 = Integer.valueOf(primitiveInt1); // Converted primitive data to object
		System.out.println(integerObject1); // printing the output in console

		// Converting Integer ( object ) to int ( primitive data )

		Integer integerObject2 = 20; // Initialized Integer object as 20
		int primitiveInt2 = integerObject2.intValue(); // Converted Object to primitive
		System.out.println(primitiveInt2); // printed the output

		// Print data type of Integer Object

		Class<?> integerObject1Class = integerObject1.getClass(); // It will create a Class object from the Integer
																	// object1
		System.out.println(integerObject1Class.getName()); // It will print the name of the Class object, which is
															// "java.lang.Integer"

		// or

		System.out.println(integerObject1.getClass().getName()); // single line solution without creating Object Class
	}
}
