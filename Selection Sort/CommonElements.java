import java.util.ArrayList;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 4, 5};
        int[] arr2 = {4, 4, 5, 6, 7, 8};
        commonElements(arr1, arr2);
    }
    public static void commonElements(int[] arr1, int[] arr2){
        int i=0; int j=0;
        ArrayList<Integer> common = new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                common.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        for(int num : common){
            System.out.print(num + " ");
        }
    }
}
