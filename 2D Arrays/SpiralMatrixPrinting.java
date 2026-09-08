import java.util.ArrayList;
import java.util.List;
public class SpiralMatrixPrinting {
    public static void main(String[] args) {
        
    }
    public static List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans = new ArrayList<>();
        int m = arr.length; int n= arr[0].length;
        int fr = 0; int lr = m-1; int fc = 0; int lc = n-1;
        while(fr<=lr && fc<=lc){
            //right
            for(int j=fc; j<=lc; j++){
                ans.add(arr[fr][j]);
            }
            fr++;
            if(fr>lr || fc >lc) break;
            //down
            for(int i=fr; i<=lr; i++){
                ans.add(arr[i][lc]);
            }
            lc--;
            if(fr>lr || fc >lc) break;
            //left
            for(int j=lc; j>=fc; j--){
                ans.add(arr[lr][j]);
            }
            lr--;
            if(fr>lr || fc >lc) break;
            //up
            for(int i=lr; i>=fr; i--){
                ans.add(arr[i][fc]);
            }
            fc++;
        }
        return ans;

    }
}
