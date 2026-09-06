import java.util.*;
public class StackFromQueues {
    Queue<Object> q = new LinkedList<>();
    public StackFromQueues() {
    }
    // Push costly, pop and peek efficient
    public void push(Object x) { // O(n)
        q.add(x);
        int n = q.size();
        for (int i = 1; i <= n - 1; i++) {
            q.add(q.remove());
        }
    }
    public Object pop() { // O(1)
        if (q.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return q.remove();
    }
    public Object peek() { // O(1)
        if (q.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return q.peek();
    }
    public int size() { // O(1)
        return q.size();
    }
    public boolean isEmpty() { // O(1)
        return q.isEmpty();
    }
    public void traverse() {
        for (Object element : q) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        StackFromQueues st = new StackFromQueues();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Stack: " + st.q);
        System.out.println("Size: " + st.size());
        System.out.println("Top: " + st.peek());
        System.out.println("Popped: " + st.pop());
        System.out.println("Popped: " + st.pop());
        System.out.println("Stack after popping: " + st.q);
        System.out.println("Top: " + st.peek());
        System.out.println("Size: " + st.size());
        System.out.println("Is empty? " + st.isEmpty());


        // traverse without a method
        // StackFromQueues st1 = new StackFromQueues();

        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);

        // for (Integer element : st.q) {
        //     System.out.println(element);
        // }
    }
}