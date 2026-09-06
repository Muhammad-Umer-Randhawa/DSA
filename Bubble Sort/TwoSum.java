import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 11, 15, 7};
        int target = 9;
        findTwoSum(arr, target);

    }
    public static void findTwoSum(int[] arr, int target){
       //doing by two pointer and with time complexity of O(n) and using built in sort
       Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                System.out.println("Two numbers found: " + arr[i] + " and " + arr[j]);
                return;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("No two elements found that sum up to the target.");

    }
}
