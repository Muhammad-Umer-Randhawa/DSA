public class PowerOfNumbers {
    public static void main(String[] args) {
        
    }
    public static int pow(int a, int b){
        if(b==0) return 1;
        int call = pow(a,b/2);
        if(b%2 == 0) return call*call;
        else return call*call*a;
    }
    public static int reverseExponenetiation(int n){
        if(n==10) return 10;
        return pow(n,n);
    }
}
