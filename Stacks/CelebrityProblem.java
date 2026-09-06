import java.util.Stack;
public class CelebrityProblem {
    public static void main(String[] args) {
        
    }
    public static int celebrity(int[][] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            st.push(i);
        }
        while(st.size() > 1){
            int a = st.pop();
            int b = st.pop();
            boolean aFlag = true;
            boolean bFlag = false;
            if(arr[a][b] == 1){ // a is not celebrity
                aFlag = false;
            }
            else{ // b is not a celebrity
                bFlag = false;
            }
            if(arr[b][a] == 1){ // b is not a celebrity
                bFlag = false;
            }
            else{ //a is not a celebrity
                aFlag = false;
            }
            if(aFlag) st.push(a);
            if(bFlag) st.push(b);
        }
        if(st.size() == 0){
            return -1;
        }
        int celeb = st.pop();
        for(int j=0; j<n; j++){
            if(j==celeb) continue;
            if(arr[celeb][j]==1) return -1;
        }
        for(int i=0; i<n; i++){
            if(i==celeb) continue;
            if(arr[i][celeb] == 0) return -1;
        }
        return celeb;
    }
}
