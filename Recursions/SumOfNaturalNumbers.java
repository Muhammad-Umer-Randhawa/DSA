public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(findSum(9));
    }
    public static int findSum(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return n + findSum(n-1);
    }
}
