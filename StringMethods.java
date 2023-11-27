package Java_EdNTech360;
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();
// ********  1. str.length()  -> to return length of the string
        System.out.println("The length of the string is : "+str.length());
//*********  2. str.lowerCase()  -> to make the string to lower case
        System.out.println("The lower case of the string is : "+str.toLowerCase());
//*********  3. str.upperCase()  -> to make the string to upper case
        System.out.println("The upper case of the string is : "+str.toUpperCase());
//*********  5. str.trim()      -> It will remove leading and trailing spaces
        System.out.println("The trimmed String is : "+str.trim());
//*********  6. str.substring(int start,int end)  -> It will fetch the sub string from the given string
        System.out.println("The substring with only start index is : "+str.substring(4));
        System.out.println("The substring with only start index is : "+str.substring(4,11));

        // Note :
        // 1. start index is included and end index is excluded
        // 2. index starts at 0

//*********  7. str.replace(oldChar,newChar)    -> To replace character in a string
        System.out.println("The new String after replacement is : "+str.replace('e','a'));
        System.out.println("The new String after replacement is : "+str.replace("meer","keel"));
//*********  8. str.
    }
}

