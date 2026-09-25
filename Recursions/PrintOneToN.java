import java.util.Scanner;

public class PrintOneToN {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt(); 
        print(n);        
        sc.close();
    }
    public static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.print(n + " ");
    }
    // public static void print(int x) {
    //     if(x > n) {
    //         return;
    //     }
    //     System.out.println(x);
    //     print(x + 1);
    // }
    // public static void print(int x, int n){
    //     if(x>n) return;
    //     System.out.println(x);
    //     print(x+1, n);
    // }
}
