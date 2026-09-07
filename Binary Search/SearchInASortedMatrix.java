public class SearchInASortedMatrix{
    public static void main(String[] args){

    }
    public static boolean searchMatrix(int[][] arr, int target){
        int rows= arr.length; int cols = arr[0].length;
        int lo = 0; int hi = rows*cols - 1;
        while(lo<=hi){
            int mid = (lo+hi) / 2;
            int midRow = mid/cols; int midCol = mid%cols;
            if(arr[midRow][midCol] == target) return true;
            else if(arr[midRow][midCol] > target) hi = mid-1;
            else lo = mid+1;
        }
        return false;
    }
}