public class swap {

    public static void reverseArray(int l,int r, int[] arr){
        if(l>=r) return;

        int tmp=arr[l];
        arr[l]=arr[r];
        arr[r]=tmp;

        reverseArray(l+1, r-1, arr);
    }

       public static boolean palamdrome(int l,int r, String st){
        if(l>=st.length()/2) return true;

        if(st.charAt(l)!=st.charAt(r))return false;

      return  palamdrome(l+1, r-1, st);

        
    }
    public static void main(String[] args) {
        // int[] arr={5,6,9,4};
        // reverseArray(0, arr.length-1, arr);
        // for(int n:arr){
        //     System.out.println(n);
        // }
        String st="MADAML";

        System.out.println(palamdrome(0, st.length()-1, st));
    }
}
