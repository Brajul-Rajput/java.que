public class Bubblesortt {
static void printsort(int arr[]){
    for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+"  ");
    }
    System.out.println();

}   
public static void main(String[] args) {
    int arr[]={78,83,11,34,26};
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=arr[i];

            }
        }
    }
printsort(arr);
} 
}
