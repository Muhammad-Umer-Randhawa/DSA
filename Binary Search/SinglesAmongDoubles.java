public class SinglesAmongDoubles {
    public static void main(String[] args) {
        
    }
    public static int singleNonDuplicate(int[] arr) {
        int n=arr.length;
        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        int i = 0; int j = n-1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) return arr[mid];
            int f = mid; int s = mid;
            if(arr[mid-1] == arr[mid]) f = mid-1;
            else s = mid+1;
            int leftCount = f-i;
            int rightCount = j-s;
            if(leftCount%2 == 0) i = s+1;
            else j = f-1;
        }
        return 1;
    }
}
