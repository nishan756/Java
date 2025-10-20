package Practice;
import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = input.nextInt();

        int i = 2;
        boolean is_prime = true;
        while (i <= num - 1){
            if (num % i == 0){
                System.out.println("Not a prime number");
                is_prime = false;
                break;
            }
            i++;
        }
        if (is_prime == true){
            System.out.print("Prime number");
        }
    }
}
