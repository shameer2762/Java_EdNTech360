package wrapperClasses;

public class StringToInt_WC {

	public static void main(String[] args) {

		// Initialization of a string ( it should contain integer value in the form of
		// String )

		String str = "123";

		// Converting String to Integer

		Integer parsedStringToInt = Integer.parseInt(str);

		// Printing the converted output

		System.out.println(parsedStringToInt);
	}

}
