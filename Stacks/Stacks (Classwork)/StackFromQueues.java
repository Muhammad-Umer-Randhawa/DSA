import java.util.*;
public class StackFromQueues {
    Queue<Integer> q = new LinkedList<>();
    public StackFromQueues() {
    }
    // Push costly, pop and peek efficient
    public void push(int x) { // O(n)
        q.add(x);
        int n = q.size();
        for (int i = 1; i <= n - 1; i++) {
            q.add(q.remove());
        }
    }
    public int pop() { // O(1)
        if (q.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return q.remove();
    }
    public int peek() { // O(1)
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
}