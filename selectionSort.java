public class selectionSort {
    public static void main(String[] args) {
        int[] arr={2,6,3,9,4,7};
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i;j<arr.length;j++){
          if(arr[min]>arr[j])min=j;
            }

            int tmp=arr[min];
            arr[min]=arr[i];
            arr[i]=tmp;
        }

        for(int n:arr){
            System.out.println(n);
        }
    }
}
