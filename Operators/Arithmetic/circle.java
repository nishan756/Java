package Operators.Arithmetic;
import java.util.Scanner;
public class circle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius:");
        double radius = input.nextDouble();
        double area = 3.1416*radius*radius;
        System.out.println("Area:"+area);
    }
}
