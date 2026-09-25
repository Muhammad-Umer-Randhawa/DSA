public class BinarySearch {
    public static void main(String[] args){
        
    }
    public static int binarySearch(int[] arr, int target){
        int n = arr.length;
        return helper(arr, target, 0, n-1);
    }
    public static int helper(int[] arr, int target, int lo, int hi){
        if(lo>hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) return helper(arr, target, lo, mid-1);
        else return helper(arr, target, mid+1, hi);
    }
}
