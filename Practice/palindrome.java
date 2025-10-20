package Practice;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = input.nextInt();

        int fake = num;
        int reversed = 0;

        while (fake > 0){
            int lastdg = fake % 10;
            fake /= 10;

            reversed = reversed * 10 + lastdg;

        }
        if (num == reversed){
            System.out.println("Yes , it's a palindrome number");
        }
        else{
            System.err.println("Not palindorme");
        }
    }
}
