import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner  input = new Scanner(System.in);
        String title = input.nextLine();
        String description = input.nextLine();
        String category = input.nextLine();
        double price = input.nextDouble();
        int id = input.nextInt();

        System.out.println("\nId:"+id+"\nTitle:"+title+"\nPrice:"+price+"\nDescription:"+description+"\nCategory:"+category);

    }
}