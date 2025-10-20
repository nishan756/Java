package Operators.Arithmetic;
import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature(C)");
        double celcius = input.nextDouble();
        double result = 1.8*celcius + 32;
        System.out.println("Fahrenheit:"+result);

    }
}
