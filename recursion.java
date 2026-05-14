
public class recursion {
    public static void print(int i,int n){
        if(i>n)return;
    System.out.println("Devashish");
    print(i+1,n);
}

public static void printd(int i,int n){
    if(i>n)return;
    System.out.println(i);
    printd(i+1, n);
}


public static void printdr(int i,int n){
    if(i<1)return;
    System.out.println(i);
    printdr(i-1, n);
}


public static void printdrb(int i,int n){
    if(i<1)return;
    printdrb(i-1, n);
    System.out.println(i);
}

public static void printdrbnTo1(int i,int n){
    if(i>n)return;
    printdrbnTo1(i+1, n);
    System.out.println(i);
}
    public static void main(String[] args) {
        // print(1,2);
        printdrbnTo1(1,5);
        
    }
}
