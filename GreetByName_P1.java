package Java_EdNTech360;
import java.util.Scanner;

public class GreetByName_P1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name : ");
        String name = sc.nextLine();

        System.out.printf("Hey %s. Have a good day!",name);

    }
}
