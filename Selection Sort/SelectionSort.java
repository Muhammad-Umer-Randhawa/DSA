public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    // Function to perform selection sort to find the minimum element in unsorted array and swap it with the first element
    // public static void selectionSort(int[] arr) {
    //     int n = arr.length;
    //     for (int i = 0; i < n - 1; i++) {
    //         int min = Integer.MAX_VALUE;
    //         int min_idx = -1;
    //         for (int j = i; j < n; j++) {
    //             if (arr[j] < min) {
    //                 min = arr[j];
    //                 min_idx = j;
    //             }
    //         }
    //         int temp = arr[i];
    //         arr[i] = arr[min_idx];
    //         arr[min_idx] = temp;
    //     }
    // }

    //Function to perform selection sort to find the maximum element in unsorted array and swap it with the last element
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int max = Integer.MIN_VALUE;
            int max_idx = -1;
            for (int j = i; j >= 0; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                    max_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max_idx];
            arr[max_idx] = temp;
        }
    }
}
