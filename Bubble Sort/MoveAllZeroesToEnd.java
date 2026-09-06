public class MoveAllZeroesToEnd{
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 3, 12};
        ZeroesToEnd(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void ZeroesToEnd(int[] arr){
        int n = arr.length;
        int j = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]!= 0){
                if(i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
}