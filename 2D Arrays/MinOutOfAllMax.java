public class MinOutOfAllMax {
    public static void main(String[] args) {
        int[][] arr = {
                {6, 0, 2, 7, 6},
                {1, 3, 7, 2, 2},
                {9, 9, 4, 5, 2}
        };
        int minOfMax = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int maxInRow = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > maxInRow) {
                    maxInRow = arr[i][j];
                }
            }
            if (maxInRow < minOfMax) {
                minOfMax = maxInRow;
            }
        }
        System.out.println("Minimum out of all row maximums: " + minOfMax);
    }
}