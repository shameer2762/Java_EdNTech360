package Java_EdNTech360;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input a : ");
        //int a = sc.nextInt(); // read int value
        //float a = sc.nextFloat();  // read float value
        //short a = sc.nextShort();  // read short value
        //byte a = sc.nextByte();   // read byte value
        long a = sc.nextLong();     // read long value

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

//**************** To check whether input is int or not ***********

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

//********************* Read Single word string ********************************
        System.out.print("Enter word : ");
        String str1 = sc.next();
        System.out.println(str1);
//********************** Reading complete string ******************


        System.out.print("Enter complete string : \n");
        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
