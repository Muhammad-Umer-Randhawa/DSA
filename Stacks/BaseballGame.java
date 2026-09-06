import java.util.Stack;
public class BaseballGame {
    public int calPoints(String[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            String s = arr[i];
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                int top = st.peek();
                st.push(2*top);
            }
            else if(s.equals("+")){
                int top = st.pop();
                int newtop = top + st.peek();
                st.push(top);
                st.push(newtop);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        while(st.size() > 0){
            sum += st.pop();
        }
        return sum;
    }
}
