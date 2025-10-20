public class Array {
    public static void main(String[] args){
        String[] info = {"Nishan" , "853756" , "A" , "CST"};
        // Length of an array
        System.out.println("Length:"+info.length);

        // Array creation using new Statement
        int[] nums = new int[10];
        int i = 0;
        do {
            nums[i] = i;
            i++;
        } while (i <= 9);

        String[] name = new String[10];
        for (int j = 1 ; j <= 9 ; j++){
            name[j] = "Nishan";
        }
        System.out.println("Length:"+nums.length);
        System.out.println("Item:"+nums[5]);
        System.out.println("Name:"+name[5]);
    }
}
