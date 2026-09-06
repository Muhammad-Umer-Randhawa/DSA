import java.util.Stack;
public class BasicSTLOfStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("A");
        st.push("B");
        st.push("C");
        st.push("D");
        st.push("E");
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st + " " + st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        //String s = st.pop();
    }
}