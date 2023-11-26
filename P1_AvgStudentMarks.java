package Java_EdNTech360;
import java.util.Scanner;
public class P1_AvgStudentMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte sub1 = sc.nextByte();
        byte sub2 = sc.nextByte();
        byte sub3 = sc.nextByte();
        byte sub4 = sc.nextByte();
        byte sub5 = sc.nextByte();

        int sum = sub1+sub2+sub3+sub4+sub5;
        double avg = sum/5;

        System.out.println(avg);

    }
}
