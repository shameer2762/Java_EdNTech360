package Java_EdNTech360;
import java.util.Scanner;

public class KiloMetersToMiles_P1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final double var = 1.609344;

        System.out.print("How many kilometers you travelled : ");
        float kiloMeters = sc.nextFloat();


        System.out.printf("Hey you travelled %.4f miles",kiloMeters/var);

    }
}
