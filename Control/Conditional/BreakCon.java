package Control.Conditional;

public class BreakCon {
    public static void main(String[] args){
        int i = 1;
        while (i < 100){
            if (i == 10){
                break;
            }
            System.out.println(i);
            i ++;
        }
    
        System.out.println("First loop has stopped");
    
        while (i < 100){
            if (i == 20){
                continue;
            }
            System.out.println(i);
            i ++;
        }
    }
}
