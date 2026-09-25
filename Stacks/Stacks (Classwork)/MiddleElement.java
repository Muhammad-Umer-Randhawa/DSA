
public class MiddleElement {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Middle element: " + getMiddle(stack));

        LinkedStack stack2 = new LinkedStack();
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);
        stack2.push(40);
        System.out.println("Middle element: " + getMiddle(stack2));
    }
    public static Object getMiddle(LinkedStack stack) {
        if (stack.size() == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        int mid = (stack.size() + 1) / 2;
        Node current = stack.top;
        for (int i = 1; i < mid; i++) {
            current = current.next;
        }
        return current.data;
    }
}
