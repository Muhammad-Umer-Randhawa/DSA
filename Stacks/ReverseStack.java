import java.util.Stack;;
public class ReverseStack {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size() <= 1){
            return;
        }
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);

    }
    public static void pushAtBottom(Stack<Integer> st, int ele){
        if(st.size() == 0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, ele);
        st.push(top);
    }
}
