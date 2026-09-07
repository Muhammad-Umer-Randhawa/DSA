public class MaxCountofPosAndNeg {
    public static void main(String[] args){
        int[] arr = {-3,-2,-1,0,0,1,2};
        maximumCount(arr);
    }
    public static int maximumCount(int[] arr) {
        int n = arr.length;
        int i = 0; int j = n-1;
        //for negative count
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] >= 0) j = mid-1;
            else{
                i = mid+1;
            }
        }
        int negCount = i;
        //for positive count
        int k = 0; int l = n-1;
        while(k<=l){
            int mid = (k+l)/2;
            if(arr[mid] <= 0) k = mid+1;
            else{
                l = mid-1;
            }
        }
        int posCount = n-k;
        return Math.max(posCount, negCount);
    }
}
