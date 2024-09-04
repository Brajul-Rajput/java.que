
public class linear {
    public static int linearsearch(int []arr,int target){
             for(int i=0;i<arr.length;i++){
                if(arr[i]==target)
                  return i;
}

        return 0;

    }

    public static void main(String[] args) {
      int []arr={12,18,5,8,9,10,66,33,17,18};
      int target=17;
     int ans= linearsearch(arr,17);
System.out.println(ans);
    }
    
}
