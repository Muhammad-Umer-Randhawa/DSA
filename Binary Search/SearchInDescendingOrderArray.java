public class SearchInDescendingOrderArray {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7 ,6, 5, 4, 3, 2, 1, 0};
        int target = 7;
        searchDescending(arr, target);
    }
    public static int searchDescending(int[] arr, int k){
        int i = 0; int j = arr.length-1;
        while(i<=j){
            int mid = (i+j) / 2;
            if (arr[mid] == k){
                System.out.println("The index of " + k + " is " + mid);
                return mid;
            }
            else if(arr[mid] < k) j = mid-1;
            else{
                i = mid+1;
            }
        }
        return -1;
    }
}
