public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(hcf(12, 16));
    }
    // by recursion
    //hcf(a,b) = hcf(b%a, a)
    //by for loop
    public static int hcf(int a, int b){ // T.C = O(log(min(a,b)))
        return helper(Math.min(a, b), Math.max(a, b));
    }
    public static int helper(int a, int b){
        if(a==0) return b;
        return helper(b%a, a);
    }
    // public static int hcf(int a, int b){
    //     int result = 0;
    //     int min = Math.min(a, b);
    //     for(int i=2; i<=min; i++){  
    //         if(a%i == 0 && b%i == 0){
    //             result = i;
    //         }
    //     }
    //     return result;
    // }
}
