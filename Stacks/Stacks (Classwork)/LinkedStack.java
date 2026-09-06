class Node {
    Object data;
    Node next;
    Node(Object data) {
        this.data = data;
    }
}
public class LinkedStack implements ImplementationOfStack {
    private int size;
    private Node top;
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public Object peek() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }
    public void push(Object ob) {
        Node newNode = new Node(ob);
        newNode.next = top;
        top = newNode;
        size++;
    }
    public Object pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        Object ob = top.data;
        top = top.next;
        size--;
       return ob;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = top;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }
    public ArrayStack toArrayStack() {
        ArrayStack as = new ArrayStack(size);
        LinkedStack temp = new LinkedStack();
        while (!this.isEmpty()) {
            temp.push(this.pop());
        }
        while (!temp.isEmpty()) {
            Object ob = temp.pop();
            this.push(ob);
            as.push(ob);
        }
        return as;
    }
    public boolean equals(LinkedStack st) {
        if (this.size != st.size) {
            return false;
        }
        Node current1 = this.top;
        Node current2 = st.top;
        while (current1 != null) {
            if (!current1.data.equals(current2.data)) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return true;
    }
    public LinkedStack slice() {
        int half = (size + 1) / 2;
        LinkedStack temp = new LinkedStack();
        LinkedStack result = new LinkedStack();
        while (!this.isEmpty()) {
            temp.push(this.pop());
        }
        for (int i = 0; i < half; i++) {
            Object ob = temp.pop();
            this.push(ob);
            result.push(ob);
        }
        while (!temp.isEmpty()) {
            this.push(temp.pop());
        }
        LinkedStack finalResult = new LinkedStack();
        while (!result.isEmpty()) {
            finalResult.push(result.pop());
        }
        return finalResult;
    }
    public void traverse() {
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        // LinkedStack ls = new LinkedStack();
        // ls.push(1);
        // ls.push(2);
        // ls.push(3);

        // LinkedStack ls2 = new LinkedStack();
        // ls2.push(1);
        // ls2.push(2);
        // ls2.push(3);

        // ls.equals(ls2);

        LinkedStack st = new LinkedStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("Sliced Stack contents: " + st.slice());

        //traverse without a method
        // LinkedStack temp = new LinkedStack();

        // while (!st.isEmpty()) {
        //     Object ob = st.pop();
        //     System.out.println(ob);
        //     temp.push(ob);
        // }

        // while (!temp.isEmpty()) {
        //     st.push(temp.pop());
        // }
    }
}