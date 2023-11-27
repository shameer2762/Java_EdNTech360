package Java_EdNTech360;

import java.util.Scanner;

public class SumOfThreeNumbers_P1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter number2 : ");
        int num2 = sc.nextInt();

        System.out.print("Enter number3 : ");
        int num3 = sc.nextInt();

        System.out.printf("%d+%d+%d = %d",num1,num2,num3,num1+num2+num3);
    }
}
