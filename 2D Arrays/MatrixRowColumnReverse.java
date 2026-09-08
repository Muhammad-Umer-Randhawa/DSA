public class MatrixRowColumnReverse {
    public static void main(String[] args) {
        int[][] arr = {
                {6, 0, 2, 7, 6},
                {1, 3, 7, 2, 2},
                {9, 9, 4, 5, 2}
        };
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}