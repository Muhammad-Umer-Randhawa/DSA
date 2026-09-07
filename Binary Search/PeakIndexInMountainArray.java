public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,5,6,7,8,3};
        peakIndexInMountainArray(arr);
    }
        public static int peakIndexInMountainArray(int[] arr) {
        int i = 1; int j = arr.length-2;
        while(i<=j){
            int mid = (i+j) / 2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) i = mid+1;
            else j = mid-1;
        }
        return 1;
    }
}

