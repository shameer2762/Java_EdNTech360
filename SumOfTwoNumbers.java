package Java_EdNTech360;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input a : ");
        //int a = sc.nextInt();
        //float a = sc.nextFloat();
        //short a = sc.nextShort();
        //byte a = sc.nextByte();
        long a = sc.nextLong();

        System.out.print("Enter input b : ");


        //int b = sc.nextInt();
        //float b = sc.nextFloat();
        //short b = sc.nextShort();
        //byte b = sc.nextByte();
        long b = sc.nextLong();

        //int sum = a + b;
        //float sum = a+b;
        //short sum = (short)(a + b);
        //byte sum = (byte)(a + b);
        long sum = a + b ;

        //System.out.printf("sum of %d and %d is %d ",a,b,sum);
        //System.out.printf("sum of %f and %f is %f", a,b,sum);
        //System.out.printf("sum of %h and %h is %h", a,b,sum);
        //System.out.printf("sum of %h and %h is %h",a,b,sum);
        System.out.printf("sum of %dl and %dl is %dl",a,b,sum);


        System.out.println();
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}
