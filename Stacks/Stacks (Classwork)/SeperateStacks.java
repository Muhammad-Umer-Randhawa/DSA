import java.util.*;
public class SeperateStacks {
    public static Object peek(ArrayStack stack) {
        return stack.peek();
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i = 1; i <= 10; i++) {
            st.push(i);
        }
        ArrayStack[] arr = new ArrayStack[10];
        for (int i = 0; i < arr.length; i++) {
            int value = st.pop();
            arr[i] = new ArrayStack(2);
            arr[i].push(value);
        }
    }
}