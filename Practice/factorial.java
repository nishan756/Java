package Practice;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = input.nextInt();
        int i = 1;
        int fact = 1;
        if (num == 0){
            System.out.println(0);
        }
        else if(num == 1){
            System.out.println(num);
        }
        else{
            while (i <= num){
                fact = fact*i;
                i++;
            }
            System.out.print(fact);

        }
        input.close();

    }
}
