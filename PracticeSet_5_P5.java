package Java_EdNTech360;
import java.util.*;
public class PracticeSet_5_P5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//********** Problem-1: Pattern Printing  ( user input )

            // ****
            // ***
            // **
            // *
//        System.out.println("Enter no Of row you required : ");
//        int noOfRows = sc.nextInt();
//        for(int i=0;i<noOfRows;i++){
//            for(int j=0;j<noOfRows-i;j++){
//                System.out.print("A");
//            }
//            System.out.println();
//        }
//*********** Problem-2: Sum of first N even numbers using while loop

//        System.out.print("Enter range : ");
//        int range = sc.nextInt();
//        int iteration = 0;
//        int result = 0;
//        while(iteration <= range){
//            if(iteration%2 == 0) {
//                result=result+iteration;
//
//            }
//            iteration++;
//        }
//        System.out.printf("Sum of even numbers till %d is : %d ",range,result);
//************ Problem-3: Multiplication table

//        System.out.print("Enter which table you want to print : ");
//        int table = sc.nextInt();
//        for(int a=1;a<=10;a++){
//            System.out.printf("%d * %d = %d ",table,a,table*a).println();
//        }

//*********** Problem-4: Multiplication table in reverse order

//        System.out.print("Enter table number you want to print in reverse order : ");
//        int tableReverse = sc.nextInt();
//        for(int b=10;b>0;b--){
//            System.out.printf("%d * %d = %d ",tableReverse,b,tableReverse*b).println();
//        }

//********** Problem-5: Factorial of a number using for loops

        System.out.print("Enter number for which you want factorial : ");
        int factorialNumber = sc.nextInt();
        int factorialResult = 1;
        for(int fact=factorialNumber;fact>1;fact--){
            factorialResult = factorialResult * fact;
        }
        System.out.printf("The Factorial of %d is : %d ",factorialNumber,factorialResult);



    }
}
