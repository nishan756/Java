package Control.Loop;
public class DoWhile{
    public static void main(String[] args){
        int i = 1;
        System.out.println("Even Number:");
        do{
            if (i % 2 == 0){
                System.out.println(i);
            }
            i ++;
        }while(i <= 100);

        i = 1;
        System.out.println("Odd Number:");
        do{
            if (i % 2 != 0){
                System.out.println(i);
            }
            i ++;
        }while(i <= 100);
    }
}