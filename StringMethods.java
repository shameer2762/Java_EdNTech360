package Java_EdNTech360;
import com.sun.security.jgss.GSSUtil;
import java.util.*;

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
//*********  8. str.startsWith(string)  -> To check whether the string starts with particular substring or not
        System.out.print("Enter substring start : ");
        String strStart = sc.nextLine();
        if(str.startsWith(strStart)){
            System.out.println("Yes you are correct. The given string starts with "+strStart+"!!");
        }else{
            System.out.println("OOPS!!. The given string doesn't starts with "+strStart+"!!");
        }
//*********  8. str.endsWith(string)  -> To check whether the string starts with particular substring or not
        System.out.print("Enter substring end : ");
        String strEnd = sc.nextLine();
        if(str.endsWith(strEnd)){
            System.out.println("Yes you are correct. The given string ends with "+strEnd+"!!");
        }else{
            System.out.println("OOPS!!. The given string doesn't ends with "+strEnd+"!!");
        }
//********* 9. str.charAt(int index)    -> to check character at particular index
        System.out.print("Enter index value you want to find out the char : ");
        int index = sc.nextInt();
        System.out.println("The character at particular index is : "+str.charAt(index));
//********* 10. str.indexOf(<string>) & str.lastIndexOf(<string>)   -> to return the index of particular char or string

        System.out.println("The index of eer is : "+str.indexOf("eer"));
        System.out.println("The index of a is : "+str.indexOf("a",5)); // from index will tell, from which index program needs to search for that character or string
        System.out.println("The index of sout is : "+str.indexOf("sout"));  // returns -1 if substring not present

        System.out.println("The last index of eer is : "+str.lastIndexOf("eer"));
        System.out.println("The last index of a is : "+str.lastIndexOf('a',10)); // from index will tell, from which index program needs to search for that character or string
        System.out.println("The last index of sout is : "+str.lastIndexOf("sout"));  // returns -1 if substring not present

//********* 11. str.equals(<string>) & str.equalsIgnoreCase(<string>)  -> compares two strings and return boolean value

        System.out.print("Enter string1 : ");
        String strEquals1 = sc.next();
        System.out.print("Enter string2 : ");
        String strEquals2 = sc.next();

        System.out.println(strEquals1.equals(strEquals2));              // case sensitive
        System.out.println(strEquals1.equalsIgnoreCase(strEquals2));    // case Insensitive


//********** 12. str.toString(<!string>)  -> to make other types to string type
       // int ab = 3;
        System.out.println(ab.toString());


    }
}

