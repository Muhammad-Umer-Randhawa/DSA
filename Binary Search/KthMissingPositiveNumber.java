public class KthMissingPositiveNumber {
    public static void main(String[] args){
        int[] arr = {2,3,4,7,11};
        int k = 5;
        findKthPositive(arr, k);
    }
    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int i=0; int j=n-1;
        while(i<=j){
            int mid = (i+j)/2;
            int correct = mid+1;
            int missing = arr[mid] - correct;
            if(missing >= k) j = mid-1;
            else i = mid+1;
        }
        return j+1+k;
    }
}
