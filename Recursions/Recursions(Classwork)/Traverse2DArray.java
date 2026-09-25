public class Traverse2DArray{
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = i * 10 + j;
            }
        }
        recPrint(arr, 0, 0);
    }
    public static void recPrint(int[][] arr, int row, int col) {
        if (row == arr.length) return;
        if (col == arr[row].length) {
            System.out.println();
            recPrint(arr, row + 1, 0);
            return;
        }
        System.out.print(arr[row][col] + " ");
        recPrint(arr, row, col + 1);
    }
}