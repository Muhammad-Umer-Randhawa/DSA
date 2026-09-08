import java.util.Scanner;
public class OutputIn2DArray {
    public static void main(String[] args){
        int[][] arr = new int[3][4];
        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        //     System.out.println();
        // }
        
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // sc.close();
        // for finding the sum of the array elements
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
