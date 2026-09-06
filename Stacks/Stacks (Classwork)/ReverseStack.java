public class ReverseStack {
    public static void main(String[] args){
        ArrayStack stack1 = new ArrayStack(5);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        ArrayStack stack2 = reverseStackArray(stack1);
        System.out.println("Reversed Array Stack:");
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }

        LinkedStack stack3 = new LinkedStack();
        stack3.push(10);
        stack3.push(20);
        stack3.push(30);
        stack3.push(40);
        LinkedStack stack4 = reverseStackLinked(stack3);
        System.out.println("Reversed Linked Stack:");
        while (!stack4.isEmpty()) {
            System.out.println(stack4.pop());
        }
    }
    public static ArrayStack reverseStackArray(ArrayStack stack1){
        ArrayStack stack2 = new ArrayStack(stack1.size());
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2;
    }
    public static LinkedStack reverseStackLinked(LinkedStack stack1){
        LinkedStack stack2 = new LinkedStack();
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2;
    }
}
