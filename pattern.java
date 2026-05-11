import java.util.Scanner;

public class pattern {
    // Pattern-1
    public static void pattern_1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pattern-1 END");

    }

    public static void pattern_2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pattern-2 END");

    }

    public static void pattern_3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern-3 END");

    }

    public static void pattern_4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern-4 END");

    }

    public static void pattern_5(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pattern-5 END");

    }

    public static void pattern_6(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern-6 END");

    }

    public static void pattern_7(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");

            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");

            }

            // for(int j=0;j<n-i+1;j++){
            // System.out.print(" ");

            // }
            System.out.println();

        }
        // System.out.println("Pattern-7 END");

    }

    public static void pattern_8(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }

            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");

            }

            // for(int j=0;j<n-i+1;j++){
            // System.out.print(" ");

            // }
            System.out.println();

        }
        // System.out.println("Pattern-8 END");

    }

    public static void pattern_9(int n) {
        pattern_7(n);
        pattern_8(n);
    }

    public static void pattern_10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int st = i;
            if (i > 5)
                st = 2 * n - i;
            for (int j = 0; j < st; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    public static void pattern_11(int n) {
        for (int i = 0; i < n; i++) {
            int st = 0;
            if (i % 2 == 0)
                st = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(st + " ");
                st = 1 - st;

            }
            System.out.println();

        }
    }

    public static void pattern_12(int n) {
        int sp = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
            sp -= 2;
        }
    }

    public static void pattern_13(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern_14(int n) {

        for (int i = 1; i <= n; i++) {
            for (char c = 'A'; c < 'A' + i; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void pattern_15(int n) {

        for (int i = 1; i <= n; i++) {
            for (char c = 'A'; c < 'A' + (n + 1 - i); c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void pattern_16(int n) {

        for (char c = 'A'; c < 'A' + n; c++) {
            for (char d = 'A'; d < c + 1; d++) {
                System.out.print(c + " ");
            }
            System.out.println();

        }
    }

    public static void pattern_17(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");

            }

            char c = 'A';
            int bp = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(c);
                if (j < bp)
                    c++;
                else
                    c--;

            }

            // for(int j=0;j<n-i+1;j++){
            // System.out.print(" ");

            // }
            System.out.println();

        }
        // System.out.println("Pattern-7 END");

    }

    public static void pattern_18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void pattern_19(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");

            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");

            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        // reverse

        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // space

            for (int j = 0; j < (2 * n) - (2 * i); j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern_20(int n) {
        int sp = 2 * n - 2;

        for (int i = 1; i <= 2 * n - 1; i++) {
            int st = i;

            if (i > n)
                st = 2 * n - i;

            for (int j = 1; j <= st; j++) {
                System.out.print("*");

            }

            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");

            }

            for (int j = 1; j <= st; j++) {
                System.out.print("*");

            }

            System.out.println();

            if (i < n)
                sp -= 2;
            else
                sp += 2;

        }
    }

    public static void pattern_21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");

                }

                else {
                    System.out.print(" ");

                }
            }
            System.out.println();

        }
    }

    public static void pattern_22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int bottom = (2 * n - 2) - i;
                int right = (2 * n - 2) - j;

                int pr = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(n - pr);

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        int n = sc.nextInt();

        // pattern_1(n);
        // pattern_2(n);
        // pattern_3(n);
        // pattern_4(n);
        // pattern_5(n);
        // pattern_6(n);
        // pattern_7(n);
        // pattern_8(n);
        // pattern_9(n);
        // pattern_10(n);
        // pattern_11(n);
        // pattern_12(n);
        // pattern_13(n);
        // pattern_14(n);
        // pattern_15(n);
        // pattern_16(n);
        // pattern_17(n);
        // pattern_18(n);
        // pattern_19(n);
        // pattern_20(n);
        // pattern_21(n);
        pattern_22(n);

        sc.close();

    }

}

