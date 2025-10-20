package Operators.Unary;

import java.util.Scanner;

public class unary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");
        int x = input.nextInt();
        int y;
        y = ++x;
        System.out.println("Pre inc:"+y);

        y = x++;
        System.out.println("post inc:"+y);

        y = --x;
        System.out.println("pre dec:"+y);

        y = x--;
        System.out.println("post dec:"+y);


    }
}
