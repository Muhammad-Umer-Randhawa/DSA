public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.currentTimeMillis();
    }
    //without recursion
    // public static void fibonacci(int n){
    //     int a = 0;
    //     int b = 1;
    //     for(int i=0; i<n; i++){
    //         System.out.print(a + " ");
    //         int next = a+b;
    //         a = b;
    //         b = next;
    //     }
    // }

    //with recursion
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
