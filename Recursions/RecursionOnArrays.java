public class RecursionOnArrays {
    public static void main(String[] args){
        int[] arr = {5,3,2,1,6,7,8,9,0};
        // recPrint(arr, 0);
        System.out.println(exists(arr, 2, 0));

    }
    //to print linearly:

    // public static void recPrint(int[] arr, int idx){
    //     int n = arr.length;
    //     if(idx == n) return;
    //     System.out.print(arr[idx] + " ");
    //     recPrint(arr, idx+1);
    // }

    //to print in reverse:

    // public static void recPrint(int[] arr, int idx){
    //     int n = arr.length;
    //     if(idx == n) return;
    //     recPrint(arr, idx+1);
    //     System.out.print(arr[idx] + " ");
    // }

    //to find if an element is in an array
    public static boolean exists(int[] arr, int ele, int idx){
        int n = arr.length;
        if(arr[idx] == ele) return true;
        if(idx == n) return false;
        return exists(arr, ele, idx+1);

    }
}
