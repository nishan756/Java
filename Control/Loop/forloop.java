package Control.Loop;

public class forloop {
    public static void main(String[] args){
        System.out.println("Even");
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.print(i+",");
            }
        }
        System.out.println("Odd");
        for (int i = 1; i <= 100; i++){
            if (i % 2 != 0){
                System.out.print(i+",");
            }
        }

    }

}
