package Java_EdNTech360;
import java.util.*;
public class PracticeSet_3_P3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//Problem-1: Convert given string to lower case
        System.out.print("Enter string to get lower case as output : ");
        String str1 = sc.nextLine();
        System.out.println("-> Output string in lower case : "+str1.toLowerCase());
//Problem-2: Replace Spaces(" ") with Underscore(_)
        System.out.print("Enter string to replace spaces with underscore : ");
        String str2 = sc.nextLine();
        System.out.println("-> Output String after replacement : "+str2.replace(" ","_"));
//Problem-3:  formatting name
        System.out.print("Enter name to format : ");
        String name = sc.nextLine();
        System.out.printf("->Dear %s, Thanks a lot!! ",name).println();
//Problem-4: Find double and triple spaces
        System.out.print("Enter string to find double and triple spaces : ");
        String str3 = sc.nextLine();
        if(str3.indexOf("  ")!=-1 && str3.indexOf("   ")!=-1){
            System.out.println("Hey you are right!. String contains both double and triple spaces");
        }else if(str3.indexOf("  ")!=-1 && str3.indexOf("   ")==-1){
            System.out.println("Only double spaces were there.");
        }else{
            System.out.println("Awesome!. your string is perfect. No extra spaces were there. Keep going!!");
        }
//Problem-5: Escape characters

        System.out.println("\"Dear Shameer. This practice Set is Cool\"");
    }
}
