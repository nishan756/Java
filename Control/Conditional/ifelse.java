package Control.Conditional;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 , num2;
        System.out.print("Enter Num1:");
        num1 = input.nextInt();
        System.out.print("Enter Num2:");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.print("Num1 is greater than num2");
        }
        else{
            System.out.print("Num2 is greater than num1");
        }

    }
}
