public class TraverseArray{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        traverse(arr, 0);
    }
    // public static void traverse(int[] arr, int x){
    //     int n = arr.length;
    //     if(x == n) return;
    //     System.out.print(arr[x] + " ");
    //     traverse(arr, x+1);
    // }

    //in reverse
    public static void traverse(int[] arr, int x){
        int n = arr.length;
        if(x == n) return;
        traverse(arr, x+1);
        System.out.print(arr[x] + " ");
    }

}