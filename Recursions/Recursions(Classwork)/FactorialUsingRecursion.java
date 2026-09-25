public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(factorialrecursion(4));
    }
    public static int factorialrecursion(int n){
        if(n==0 || n==1) return 1;
        return n * factorialrecursion(n-1);
    }
}
