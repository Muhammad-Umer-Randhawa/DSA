public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{6, 0, 2},
                       {1, 3, 7},
                       {9, 9, 4}};
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int[] a : arr){
            for(int ele: a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
