package Java_EdNTech360;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input a : ");
        //int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.print("Enter input b : ");
        //int b = sc.nextInt();
        float b = sc.nextFloat();

        //int sum = a + b;
        float sum = a+b;

        //System.out.printf("sum of %d and %d is %d ",a,b,sum);
        System.out.printf("sum of %f and %f is %f", a,b,sum);
    }
}
