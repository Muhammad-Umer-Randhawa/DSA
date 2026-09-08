public class SnakePrintColumnWise {
    public static void main(String[] args) {
        int[][] arr = {
                {6, 0, 2, 7, 6},
                {1, 3, 7, 2, 2},
                {9, 9, 4, 5, 2}};
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 != 0) {
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}