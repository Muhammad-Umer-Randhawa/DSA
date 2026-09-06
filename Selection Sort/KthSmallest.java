public class KthSmallest {
    public static void main(String[] args){
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(kthSmallest(arr, k));
    }
    public static int kthSmallest(int[] arr, int k){
        //O(n * k) time complexity
        int n = arr.length;
        for(int i = 0; i < k; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j = i; j < n; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr[k - 1];
    }
}
