public class SearchInATwoDMatrix {
    public static void main(String[] args) {
        
    }
     public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length; int n = arr[0].length;
        int i=0; int j=n-1;
        while(j>=0 && i<m){
            if(arr[i][j] > target) j--;
            else if(arr[i][j] < target) i++;
            else return true;
        }
        return false;
    }
}
