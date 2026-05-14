public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {2, 6, 3, 9, 4, 7};

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int j = i ;

            // shift larger elements to the right
            while (j >= 0 && arr[j-1] > current) {

        int tmp=arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=tmp;
                j--;

            }

        }

        for (int n : arr) {
            System.out.println(n);
        }
    }
}