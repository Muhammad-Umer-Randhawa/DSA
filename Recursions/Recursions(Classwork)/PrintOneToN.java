public class PrintOneToN {
    static int n;
    public static void main(String[] args) {
        System.out.println(print(100));
    }
    public static int print(int n){
        if(n==0 || n==1) return 1;
        int m = 0;
        if(n%2 == 0){
            m = n + print(n-1);
        }
        return m;
    }
}