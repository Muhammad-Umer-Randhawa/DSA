//a^b = a*a^b-1
import java.util.Scanner;
public class PowerLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter power: ");
        int b= sc.nextInt();
        System.out.println(a + " raised to the power " + b + " = " + pow(a, b));
        sc.close();
    } 
    public static int pow(int a, int b){ // T.C = O(logb)
        if(b==0) return 1;
        int call = pow(a, b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }
    // public static int pow(int a, int b){ // T.C = O(b)
    //     if(b==0) return 1;
    //     return a*pow(a, b-1);
    // }
}
