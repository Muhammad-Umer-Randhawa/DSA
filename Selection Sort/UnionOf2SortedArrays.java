import java.util.ArrayList;

public class UnionOf2SortedArrays {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        union(arr1, arr2); // Output will be: 1 2 3 4 5 6 7 
    }

    public static void union(int[] arr1, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                list.add(arr1[i]);
                i++;
            }
            else if (arr2[j] < arr1[i]) {
                list.add(arr2[j]);
                j++;
            }
            else {
                list.add(arr1[i]); 
                i++;
                j++;
            }
        }
        while (i < arr1.length) {
            list.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            list.add(arr2[j]);
            j++;
        }

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}