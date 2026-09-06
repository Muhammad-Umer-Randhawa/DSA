public class GetBottomElement {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Bottom element: " + getBottom(stack));
    }

    public static Object getBottom(LinkedStack stack) {
        LinkedStack temp = new LinkedStack();
        if(stack.size() == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        while (stack.size() > 1) {
            temp.push(stack.pop());
        }
        Object bottom = stack.peek();
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return bottom;
    }
}
