public class SortingInStack {
    public static void main(String[] args){
        LinkedStack stack1 = new LinkedStack();
        stack1.push(11);
        stack1.push(0);
        stack1.push(1);
        stack1.push(-111);
        stack1.push(50);

        LinkedStack stack2 = new LinkedStack();
        stack2 = sortStack(stack1);
        System.out.println("Sorted Linked Stack:"); 
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop() + " ");
        }
    }
    public static LinkedStack sortStack(LinkedStack stack1) {
    LinkedStack stack2 = new LinkedStack();
    LinkedStack temp = new LinkedStack();
    while (!stack1.isEmpty()) {
        Integer value = (Integer) stack1.pop();
        while (!stack2.isEmpty() &&
               (Integer) stack2.peek() < value) {
            temp.push(stack2.pop());
        }
        stack2.push(value);
        while (!temp.isEmpty()) {
            stack2.push(temp.pop());
        }
    }
    return stack2;
}
}
