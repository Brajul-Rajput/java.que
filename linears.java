

public class linears {
    static int linearstring(String nameltr,char target){

for(int i=0;i<nameltr.length();i++){
    if(nameltr.charAt(i)==target)
    return i;
}

        return -1;
    }
    public static void main(String[] args) {
        String name="brajul";
        char target='j';
        
        int ans=linearstring(name,'j');
        System.out.println(ans);
    }
}
