public class UsingBubbleToReverse {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        bubbleReverse(arr);
    }
    public static void bubbleReverse(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
