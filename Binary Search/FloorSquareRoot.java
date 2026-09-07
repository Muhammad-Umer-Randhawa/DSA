public class FloorSquareRoot {
    public static void main(String[] args) {
        mySqrt(67);
    }
   public static int mySqrt(int n) {
        if(n==0) return 0;
        int i=1; int j=n;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(mid == n/mid) return mid;
            else if(mid > n/mid) j = mid - 1;
            else i = mid + 1;
        }
        return j;
    }
}
