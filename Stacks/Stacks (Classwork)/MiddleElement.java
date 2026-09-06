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
        int mid = (stack.size()+1)/2;
        LinkedStack temp = new LinkedStack();
        if(stack.size() == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        for(int i=0; i<mid-1; i++) {
            temp.push(stack.pop());
        }
        Object middle = stack.peek();
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return middle;
    }
}
