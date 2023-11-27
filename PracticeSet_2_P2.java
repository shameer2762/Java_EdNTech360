package Java_EdNTech360;
import java.util.Scanner;
public class PracticeSet_2_P2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//****************** 1. Expression *************************
        System.out.println(7/4.0f * 9/2.0f);
//****************** 2. Encrypt and decrypt ****************

        System.out.print("Enter String to read the character : ");
        char grade = sc.next().charAt(0);           // Reading original grade from user
        char encryptedGrade = (char)(grade+8);      // Encrypting grade by adding + 8 to it
        System.out.println("Encrypted Grade is : "+encryptedGrade); // printing the encrypted grade
        char decryptedGrade = (char)(encryptedGrade-8); // Decrypting grade by subtracting -8 to encrypted grade
        System.out.println("Decrypted/original Grade is : "+decryptedGrade); // printing the decrypted output

//***************** 3. Comparison Operator ******************************
        System.out.print("Enter number : ");
        int num1 = sc.nextInt();

        int checkDigit = 9;

        if(num1>checkDigit){
            System.out.println("Hey your entered value is greater than check digit");
        }else if(num1<checkDigit){
            System.out.println("Hey your entered value is less than check digit");
        }else{
            System.out.println("You got it right! that is the exact check digit you entered. Awesome!!");
        }

//********************* 4. Solve Equation of motion v2-u2/2as ***********************
        System.out.print("Enter Final velocity (v) : ");
        int finalVelocity = sc.nextInt();

        System.out.print("Enter Initial velocity (u) : ");
        int initialVelocity = sc.nextInt();

        System.out.print("Enter acceleration (a) : ");
        int acceleration = sc.nextInt();

        System.out.println("Enter displacement (s) : ");
        int displacement = sc.nextInt();

        double motion = (finalVelocity*finalVelocity-initialVelocity*initialVelocity)/(2*acceleration*displacement);
        System.out.println("Motion : "+motion);


    }
}
