              // Search for a number 3 in the range [1,4]

public class linear1 {
    static int linearsearch(int []arr,int target){
        int start=1;
        int end=4;
        for(int i=start;i<=end;i++){
            if(arr[i]==target)
            return i;
        }
        return -1;
    }
public static void main(String[] args) {
    int []arr={19,12,-7,3,14,28};
    int target=3;
    int ans=linearsearch(arr,3);
    System.out.println(ans);
}

}

