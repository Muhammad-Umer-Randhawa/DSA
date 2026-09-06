public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Top element: " + stack.peek());
        System.out.println("Size: " + stack.size());

        System.out.println("Stack contents: " + stack.toString());

        LinkedStack linkedStack = stack.toLinkedStack();
        System.out.println("LinkedStack contents: " + linkedStack.toString());
    }
}