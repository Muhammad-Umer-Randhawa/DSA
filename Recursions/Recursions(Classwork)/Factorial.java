public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
        if(n==0 || n==1) return 1;
        int m = 1;
        for(int i=1; i<=n; i++){
            m = m*i;
        }
        return m;
    }
}
