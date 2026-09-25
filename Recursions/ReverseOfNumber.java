public class ReverseOfNumber{
    public static void main(String[] args) {
        int n = 2456;
        System.out.println(reverse(n, 0)); 
    }
    public static int reverse(int n, int r){
        if(n==0) return r;
        return reverse(n/10, r*10+n%10);
    }
}
// reverse(2456, 0)
//   → n%10 = 6,  r = 0*10 + 6  = 6,    n becomes 245
// reverse(245, 6)
//   → n%10 = 5,  r = 6*10 + 5  = 65,   n becomes 24
// reverse(24, 65)
//   → n%10 = 4,  r = 65*10 + 4 = 654,  n becomes 2
// reverse(2, 654)
//   → n%10 = 2,  r = 654*10+2  = 6542, n becomes 0
// reverse(0, 6542)
//   → n == 0, so STOP. Return 6542 