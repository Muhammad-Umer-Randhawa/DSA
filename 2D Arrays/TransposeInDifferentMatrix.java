public class TransposeInDifferentMatrix {
    public static void main(String[] args){
        int[][] arr = {{6, 0, 2, 7, 6},
                       {1, 3, 7, 2, 2},
                       {9, 9, 4, 5, 2}};
        transpose(arr);
    }
    //for rectangular matrix
    public static int[][] transpose(int[][] a) {
        int row = a.length;
        int col = a[0].length;
        int[][] b = new int[col][row];
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[0].length; j++){
                b[i][j] = a[j][i];
            }
        }
        for(int i = 0; i<b.length; i++){
            for(int ele : b[i]){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        return b;
    }
}
