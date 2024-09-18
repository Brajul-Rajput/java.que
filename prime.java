import java.util.*;
public class prime {
    public static  void  main(String[]args){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
         for(int i=2;i<51;i++){
            if(num%i==0){
                System.out.println(i);
            }
         }
    }
}
