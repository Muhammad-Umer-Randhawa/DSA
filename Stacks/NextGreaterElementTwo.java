import java.util.Stack;

public class NextGreaterElementTwo {
    public static void main(String[] args){
        NextGreaterElementTwo obj = new NextGreaterElementTwo();
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = obj.nextGreaterElements(arr);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            st.push(arr[i]);
        }
        for(int i=n-1; i>=0; i--){
            while(st.size() > 0 && arr[i] >= st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }
}