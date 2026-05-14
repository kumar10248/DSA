public class hashing {
    public static int Integerhash(int q,int[] arr){
        int hash[] =new int[13];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }

        return hash[q];
    }


    public static int charHash(char c,String st){
int[] hash=new int[256];
for(int i=0;i<st.length();i++){
    hash[st.charAt(i)]++;
}
    return hash[c];

}
    
    public static void main(String[] args) {
        // int arr[]={3,5,3,6,4,12,5,6};
        // System.out.println(Integerhash(11,arr));
        System.out.println(charHash('s',"DevashiSh"));
        
    }
}
