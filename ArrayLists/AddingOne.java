import java.util.ArrayList;
import java.util.Collections;

public class AddingOne {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {9, 9, 9};
        
        System.out.println("123 + 1 = " + addOne(arr1)); // Expected: [1, 2, 4]
        System.out.println("999 + 1 = " + addOne(arr2)); // Expected: [1, 0, 0, 0]
    }

    public static ArrayList<Integer> addOne(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int carry = 1; // Start with 1 because we want to add one

        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            
            // The digit to keep is the remainder of dividing by 10 (e.g., 10 % 10 = 0, 4 % 10 = 4)
            result.add(sum % 10);
            
            // The carry is 1 if sum >= 10, otherwise 0
            carry = sum / 10;
        }

        // If there's still a carry left at the very end (e.g., 999 + 1)
        if (carry == 1) {
            result.add(1);
        }

        // Reverse it because we added digits from right to left
        Collections.reverse(result);
        return result;
    }
}