package Java_EdNTech360;
import java.util.Scanner;
public class CalculateCGPA {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum Marks : ");
        int maxMarks = sc.nextInt();

        System.out.print("Enter subject1 Marks : ");
        int sub1 = sc.nextInt();

        System.out.print("Enter subject2 Marks : ");
        int sub2 = sc.nextInt();

        System.out.print("Enter subject3 Marks : ");
        int sub3 = sc.nextInt();

        int sum = sub1+sub2+sub3;
        int totalMarks = maxMarks*3;
        int CGPA = (sum*100)/totalMarks;

        System.out.printf("Hey your CGPA is %.2f:",CGPA/9.5);
    }
}
