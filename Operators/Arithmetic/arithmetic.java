package Operators.Arithmetic;
import java.util.Scanner;
public class arithmetic{
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter A:");
        a = input.nextInt();
        System.out.println("Enter B:");
        b = input.nextInt();
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        System.out.print("Sum:"+sum+"\nSub:"+sub+"\nMul:"+mul+"\nDiv:"+div+"\nMod:"+mod);
    }
}