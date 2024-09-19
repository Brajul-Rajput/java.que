 class floor {
    static int floornumber(int []arr,int target){
               int start=0;
               int end =arr.length-1;
              
                
                while(start<=end){
                   int mid=start+(end-start)/2;
                   if(arr[mid]==target){
                       return mid;
                   }
                   else if(target>arr[mid]){
                       start=mid+1;
                   }
                   else{
                       end=mid-1;
                   }
               }
               return end;    
           }
           public static void main(String[] args) {
               int []arr={3,7,9,15,23,67};
             int target=16;
        int ans=floornumber(arr,16);
        System.out.println(ans);
       
           }
       }
         
    

