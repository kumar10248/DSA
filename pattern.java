import java.util.Scanner;
public class pattern {
    // Pattern-1
    public static void pattern_1(int n){
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        System.out.print("* ");
    }
    System.out.println();
   } 
    System.out.println("Pattern-1 END");

}

 public static void pattern_2(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    } 
    System.out.println("Pattern-2 END");

}

public static void pattern_3(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    } 
    System.out.println("Pattern-3 END");

}
public static void pattern_4(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    } 
    System.out.println("Pattern-4 END");

}
 public static void pattern_5(int n){
    for(int i=n;i>0;i--){
        for(int j=0;j<i;j++){
            System.out.print("* ");
        }
        System.out.println();
    } 
    System.out.println("Pattern-5 END");

}
 public static void pattern_6(int n){
    for(int i=n;i>0;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    } 
    System.out.println("Pattern-6 END");

}

 public static void pattern_7(int n){
    for(int i=0;i<n;i++){

        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");

        }

         for(int j=0;j<2*i+1;j++){
            System.out.print("*");

        }

        //  for(int j=0;j<n-i+1;j++){
        //     System.out.print(" ");

        // }
        System.out.println();

        
    } 
    // System.out.println("Pattern-7 END");

}

public static void pattern_8(int n){
    for(int i=0;i<n;i++){

     
        for(int j=0;j<i;j++){
            System.out.print(" ");

        }

         for(int j=0;j<2*n-(2*i+1);j++){
            System.out.print("*");

        }

        //  for(int j=0;j<n-i+1;j++){
        //     System.out.print(" ");

        // }
        System.out.println();

        
    } 
    // System.out.println("Pattern-8 END");

}

public static void pattern_10(int n){
    for(int i=1;i<=2*n-1;i++){
        int st=i;
        if(i>5)st=2*n-i;
        for(int j=0;j<st;j++){
            System.out.print("*");

        }
        System.out.println();

    }
}

public static void pattern_11(int n){
    for(int i=0;i<n;i++){
        int st=0;
        if(i%2==0)st=1;
        for(int j=0;j<=i;j++){
            System.out.print(st+" ");
            st=1-st;

        }
        System.out.println();

    }
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter input: ");
    int n=sc.nextInt();

//  pattern_1(n);
//  pattern_2(n);
//  pattern_3(n);
//  pattern_4(n);
//  pattern_5(n);
//  pattern_6(n);
//  pattern_7(n);
//  pattern_8(n);
// pattern_10(n);
pattern_11(n);


 
 







 sc.close();
    
}

    }
