public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,4,10,10,12,19};
        int k = 5;
        int a = findFloor(arr, k);
        System.out.println(a);
    }
    public static int findFloor(int[] arr, int x){
        int i = 0;
        int j = arr.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] <= x) {
                ans = mid;  
                i = mid + 1;
            }
            else j = mid - 1;
        }
        return ans;
    }
}
