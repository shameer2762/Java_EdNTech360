package Java_EdNTech360;
import java.util.Scanner;
public class StudentPercentage_P1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter max marks : ");
        int maxMarks = sc.nextInt();

        System.out.print("Enter Telugu subject marks : ");
        int teluguMarks = sc.nextInt();

        System.out.print("Enter Hindi subject marks : ");
        int hindiMarks = sc.nextInt();

        System.out.print("Enter English subject marks : ");
        int englishMarks = sc.nextInt();

        System.out.print("Enter mathematics marks : ");
        int mathMarks = sc.nextInt();

        System.out.print("Enter physics marks : ");
        int physicsMarks = sc.nextInt();

        System.out.print("Enter Biology marks : ");
        int biologyMarks = sc.nextInt();

        System.out.print("Enter Social marks : ");
        int socialMarks = sc.nextInt();

        int sum = (teluguMarks+hindiMarks+englishMarks+mathMarks+physicsMarks+biologyMarks);
        int totalMarks = maxMarks*7;

        float percentage = (sum*100)/totalMarks;

        System.out.printf("Hey you got %.2f percentage!",percentage);
    }
}
