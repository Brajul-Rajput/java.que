import java.util.*;
public class linear2d {
    public static void main(String[] args) {
        int [][]arr={
            {12,45,23},
            {67,34,78,90},
            {4,76}
        };
Scanner sc=new Scanner(System.in);
int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    System.out.println( " row  : "+i+"   "+"col  : "+j);

}
            }
        }
    }
}
