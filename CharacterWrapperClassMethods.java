package wrapperClasses;

public class CharacterWrapperClassMethods {

	public static void main(String[] args) {

// ***************** Character.valueOf(<char value>)  *********************

		Character ch = Character.valueOf('A'); // To create the Character object
		System.out.println(ch.charValue()); // Print using charVvalue

//****************** Character.isDigit(<char value>) ************************

		Character ch1 = '5'; // Initializing ch1 as 5
		System.out.println(Character.isDigit(ch1)); // checking whether 5 is digit or not. returns true or false

//******************* Character.isLetter(<char value>) **********************

		Character ch2 = 'S'; // Initializing ch1 as 'S'
		System.out.println(Character.isLetter(ch2)); // checking whether 'S' is letter or not. returns true or false

//***************** Character.isWhitespace(<char value>) ******************

		Character ch3 = Character.valueOf(' '); // Initializing ch1 as ' ' i.e., space
		System.out.println(Character.isWhitespace(ch3)); // checking whether ' ' is space or not. returns true or false

//***************** <character1>.equals(<character2>) **********************

		Character ch4 = '1'; // Initializing ch1 as 5
		Character ch5 = '1'; // Initializing ch1 as 5

		System.out.println(ch4.equals(ch5));

//**************** <character1>.comareTo(<character2>) *******************

		Character ch6 = 'b'; // Initializing ch1 as 5
		Character ch7 = 'a'; // Initializing ch1 as 5

		System.out.println(ch6.compareTo(ch7));

// Note:  equals compares the content of the variables like 'A'=='B' and return boolean value
// compareTo converts values to Unicode values then subtract and will return +1 or 0 or -1
	}

}
