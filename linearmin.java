public class linearmin {
    
    public static void main(String[] args) {
        int []arr={12,13,17,44,66,34,11,9};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println( "max no.in array:"+min);
    }
}

