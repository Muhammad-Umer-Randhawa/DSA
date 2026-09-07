public class SearchElementInSortedAndRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        search(arr, target);
    }
    public static int search(int[] arr, int target) {
        int n= arr.length;
        int i = 0; int j = n-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == target){
                 System.out.println(arr[mid] + " is in the array");
                 return arr[mid];
            }
            else if(arr[mid] < target) i = mid+1;
            else j=mid-1;
        }
        return -1;    
    }
}
