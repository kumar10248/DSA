public class sumRecursion {

    public static void add(int i, int sum) {
        if (i < 1) {

            System.out.println(sum);
            return;

        }
        add(i - 1, sum + i);
    }


    public static int sum(int n) {
        if (n ==0) {

        
            return 0;

        }
       return n+sum(n-1);
    }

    public static void main(String[] args) {
        // add(3, 0);
        System.out.println(sum(4));
    }
}
