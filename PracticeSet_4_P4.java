package Java_EdNTech360;
import java.util.*;
public class PracticeSet_4_P4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//******* Problem-1: If age is above 18 print your are eligible for vote else not
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        if(age>=18){
//            System.out.println("1: you are eligible vote");
//        }else{
//            System.out.println("1: you are not eligible to vote.");
//        }
//*********  Problem-2: Pass or fail based on percentage

//        System.out.print("Enter maximum Marks : ");
//        int maxMarks = sc.nextInt();
//
//        System.out.print("Enter subject-1 Marks : ");
//        int subject1 = sc.nextInt();
//        System.out.print("Enter subject-2 Marks : ");
//        int subject2 = sc.nextInt();
//        System.out.print("Enter subject-3 Marks : ");
//        int subject3 = sc.nextInt();
//
//        int per1 = subject1*100/maxMarks;
//        int per2 = subject2*100/maxMarks;
//        int per3 = subject3*100/maxMarks;
//
//        int totalPercentage = (subject1+subject2+subject3)*100/(maxMarks*3);
//        if(per1 < 33 || per2 < 33 || per3 < 33){
//            System.out.println("2: You are failed!!");
//        }else if(totalPercentage < 40){
//            System.out.println("2: You are failed!!");
//        }else{
//            System.out.println("2: Congrats!! you pss");
//        }
//******  Problem-3: Tax Calculation
//        System.out.print("Enter your income : ");
//        float income = sc.nextFloat();
//
//        if(income <= 2.5){
//            System.out.println("3: No tax deduction");
//        }else if(income > 2.5 && income <= 5.0 ){
//            float tax = (income*5/100)*10000;
//            System.out.printf("3: your tax deduction amount is : %.2f rupees",tax).println();
//        }else if(income > 5.0 && income <= 10.0 ){
//            float tax = (income*20/100)*10000;
//            System.out.printf("3: your tax deduction amount is : %.2f rupees",tax).println();
//        }else{
//            float tax = (income*30/100)*10000;
//            System.out.printf("3: your tax deduction amount is : %.2f rupees",tax).println();
//        }
//******* Problem-4: Switch case to find out day of the week
//        System.out.print("Enter number for the day : ");
//        int dayNumber = sc.nextInt();
//        // Legacy switch Implementation
//        switch(dayNumber){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Don't know");
//        }
//
//        // Enhanced Switch Implementation
//
//        switch (dayNumber){
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("None");
//        }
//**********  Problem-5: Leap Year check

        System.out.print("Enter year : ");
        int year = sc.nextInt();
        if((year%4==0 &&  year%100!=0)  || year%400==0){
            System.out.printf("5. year ( %d ) is a leap year",year).println();
        }else{
            System.out.printf("5. year ( %d ) is not a leap year",year).println();
        }
//********** Problem-6: string ends with

        System.out.println("Enter your website name : ");
        sc.nextLine();      // Note point
        String website = sc.nextLine();
        if(website.endsWith(".com") || website.endsWith(".org") || website.endsWith(".in")){
            System.out.println("Good website!!");
        }else{
            System.out.println("Bad Website!!");
        }

  //Note Point :    the Scanner.nextInt method does not read the newline character in your input created by hitting "Enter,"
  //                and so the call to Scanner.nextLine returns after reading that newline. put a Scanner.nextLine call after each Scanner.nextInt to consume rest of that line including newline



    }
}
