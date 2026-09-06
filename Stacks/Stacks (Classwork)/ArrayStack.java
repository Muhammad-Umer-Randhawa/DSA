public class ArrayStack implements ImplementationOfStack {
    private int size;
    private Object[] a;
    public ArrayStack(int capacity) {
        a = new Object[capacity];
    }
    public Object pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        Object ob = a[size - 1]; // pop removes the top element, and top is always at size - 1 index
        a[size - 1] = null;
        size--;
        return ob;
    }
    public void push(Object ob) {
        if (size == a.length) {
            resize();
        }
        a[size] = ob;
        size++;
    }
    public int size() {
        return size;
    }
    public Object peek() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return a[size - 1];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    private void resize() {
        Object[] old = a;
        a = new Object[2 * old.length];
        System.arraycopy(old, 0, a, 0, size);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            sb.append(a[i]).append(" ");
        }
        return sb.toString().trim();
    }
    public LinkedStack toLinkedStack() {
        LinkedStack ls = new LinkedStack();
        for(int i=0; i<size; i++){
            ls.push(a[i]);
        }
        return ls;
    }
    public boolean equals(ArrayStack st) {
        if (this.size != st.size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!this.a[i].equals(st.a[i])) {
                return false;
            }
        }
        return true;    
    }
    public ArrayStack slice() {
        int half = (size + 1) / 2;
        ArrayStack result = new ArrayStack(half);
        for (int i = size - half; i < size; i++) {
            result.push(a[i]);
        }
        return result;
    }
}