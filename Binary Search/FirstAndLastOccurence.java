public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,2,2,2,2,2,2,2,3,4,8,9,9,10,10};
        int k = 2;
        firstSearch(arr, k);
    }
    public static int firstSearch(int[] arr, int k) {
        int i=0; int j=arr.length-1;
        int idx = -1;
        while(i<=j){
            int mid = (i+j) / 2;
            if(arr[mid] > k) j = mid-1;
            else if(arr[mid] < k) i = mid + 1;
            else{
                idx = mid;
                j = mid-1;
            }
        }
        if (idx != -1) {
            System.out.println("The first occurence of " + k + " is at index " + idx);
        } else {
            System.out.println(k + " not found in the array.");
        }
        int l=0; int m=arr.length-1;
        int idx2 = -1;
        while(l<=m){
            int mid = (l+m) / 2;
            if(arr[mid] > k) m = mid-1;
            else if(arr[mid] < k) l = mid + 1;
            else{
                idx2 = mid;
                l = mid+1;
            }
        }
        if (idx2 != -1) {
            System.out.println("The last occurence of " + k + " is at index " + idx2);
        }
        return idx;
    }
}
