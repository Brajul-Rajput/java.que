import java.util.Arrays;
import java.util.Scanner;
public class arr{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        // input in arrays

        int [] nums=new int [5];
        System.out.println("enter the arrays element :");
        for(int i=0;i<nums.length;i++){
            nums[i]=in.nextInt();
        }

            // output in arrays

            System.out.println("output of arrays :");
            System.out.println(Arrays.toString(nums));

        }

}