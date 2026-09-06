public class MergeStacks {
    public static void main(String[] args) {
        LinkedStack st1 = new LinkedStack();
        st1.push(1); st1.push(2); st1.push(3);

        LinkedStack st2 = new LinkedStack();
        st2.push(4); st2.push(5); st2.push(6);

        LinkedStack merged = MergeStacks.mergeSt2ReversedOnTop(st1, st2);
        // LinkedStack merged = MergeStacks.mergeSt2OnTop(st1, st2);
        // LinkedStack merged = MergeStacks.mergeSt1OnTop(st1, st2);

        while (!merged.isEmpty()) {
            System.out.print(merged.pop() + " ");
        }
        // Output: 4 5 6 3 2 1
    }

    // 1) st2 placed on top of st1
    public static LinkedStack mergeSt2OnTop(LinkedStack st1, LinkedStack st2) {
        LinkedStack result = new LinkedStack();
        LinkedStack temp = new LinkedStack();

        // copy st1 preserving its original order (pop->temp->result = double reversal)
        while (!st1.isEmpty()) temp.push(st1.pop());
        while (!temp.isEmpty()) result.push(temp.pop());

        // copy st2 preserving its original order, stacked on top
        while (!st2.isEmpty()) temp.push(st2.pop());
        while (!temp.isEmpty()) result.push(temp.pop());

        return result;
    }

    // 2) st1 placed on top of st2
    public static LinkedStack mergeSt1OnTop(LinkedStack st1, LinkedStack st2) {
        // Just reuse method 1 with arguments swapped
        return mergeSt2OnTop(st2, st1);
    }

    // 3) st2 REVERSED, placed on top of st1
    public static LinkedStack mergeSt2ReversedOnTop(LinkedStack st1, LinkedStack st2) {
        LinkedStack result = new LinkedStack();
        LinkedStack temp = new LinkedStack();

        // copy st1 preserving order (double transfer, as before)
        while (!st1.isEmpty()) temp.push(st1.pop());
        while (!temp.isEmpty()) result.push(temp.pop());

        // push st2 DIRECTLY — a single pop→push naturally reverses it
        while (!st2.isEmpty()) result.push(st2.pop());

        return result;
    }
}