package Java_EdNTech360;
import java.util.*;

public class Ex1_rockPaperScissor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int user = 0;
        int system = 0;
        int iterate = 1;
        while(iterate<=5){
            int randomNumber = (int)(Math.random()*10);

            System.out.print("Take user input "+iterate+": ");
            int userInput = sc.nextInt();
            if(userInput == randomNumber){
                user++;
                System.out.printf("Current score is user : %d  and System : %d ",user,system).println();
            }else{
                system++;
                System.out.printf("Current score is user : %d  and System : %d ",user,system).println();
            }
            iterate++;
        }

        String result = (user>system)  ? "Done!!. User won this match " : "Done!!. System won this match ";
        System.out.println(result);
    }
}
