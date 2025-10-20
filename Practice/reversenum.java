package Practice;
import java.util.Scanner;

public class reversenum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");

        int num = input.nextInt();

        int fake = num;
        while (fake > 0){
            int lastdg = fake % 10;
            fake /= 10;
            System.out.print(lastdg);
        }

    }
}
