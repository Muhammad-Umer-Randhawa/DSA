public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
        binarySearch(arr, 10);
    }
    public static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int i = 0; int j = n-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == target){
                System.out.println(arr[mid] + " is in the array");
                return mid;
            }
            else if(arr[mid] < target) i = mid+1;
            else j=mid-1;
        }
        return -1;    
    }
}