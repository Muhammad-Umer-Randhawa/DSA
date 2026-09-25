// import java.util.Stack;

public class StacksPractice {
    public static void main(String[] args) {
        // LinkedStack ls1 = new LinkedStack();
        // ls1.push(1);
        // ls1.push(2);
        // ls1.push(3);

        // LinkedStack ls2 = new LinkedStack();
        // ls2.push(4);
        // ls2.push(5);
        // ls2.push(6);

        // LinkedStack ls3 = new LinkedStack();
        // ls3.push(ls1.peek());
        // ls3.push(ls2.peek());

        // LinkedStack ls4 = new LinkedStack();

        // int s1 = ls1.size();
        // int s2 = ls2.size();
        // int s3 = ls3.size();

        // LinkedStack temp1 = new LinkedStack();
        // while (s1 > 1) {
        //     temp1.push(ls1.pop());
        //     s1--;
        // }
        // int bottom1 = (int) ls1.peek();

        // LinkedStack temp2 = new LinkedStack();
        // while (s2 > 1) {
        //     temp2.push(ls2.pop());
        //     s2--;
        // }
        // int bottom2 = (int) ls2.peek();

        // LinkedStack temp3 = new LinkedStack();
        // while (s3 > 1) {
        //     temp3.push(ls3.pop());
        //     s3--;
        // }
        // int bottom3 = (int) ls3.peek();

        // ls4.push(bottom1);
        // ls4.push(bottom2);
        // ls4.push(bottom3);

    
    // LinkedStack ls = new LinkedStack();
    // for (int i = 1; i <= 9; i++) {
    //     ls.push(i);
    // }
    // LinkedStack ls2 = new LinkedStack();
    // int size = ls.size();
    // for (int i = 0; i < size; i++) {
    //     Object a = ls.pop();
    //     if ((int) a % 3 == 0) {
    //         ls2.push(a);
    //     }
    // }
        // LinkedStack st1 = new LinkedStack();
        // for(int i=1; i<=10; i++){
        //     st1.push("B" + i);
        // }
        // LinkedStack st2 = new LinkedStack();
        // for(int i=1; i<=10; i++){
        //     st2.push("B" + (i+10));
        // }
        // LinkedStack st3 = new LinkedStack();
        // for(int i=1; i<=10; i++){
        //     st3.push("B" + (i+20));
        // }
        // LinkedStack st4 = new LinkedStack();
        // for(int i=1; i<=10; i++){
        //     st4.push("B" + (i+30));
        // }
        // LinkedStack st5 = new LinkedStack();
        // for(int i=1; i<=10; i++){
        //     st5.push("B" + (i+40));
        // }
        // Object myCopy = "B17";
        // while(!st1.isEmpty()){
        //     Object m = st1.pop();
        //     if(m.equals(myCopy)){
        //         System.out.println("Copy found in stack 1");
        //     }
        // }
        // while(!st2.isEmpty()){
        //     Object m = st2.pop();
        //     if(m.equals(myCopy)){
        //         System.out.println("Copy found in stack 2");
        //     }
        // }
        // while(!st3.isEmpty()){
        //     Object m = st3.pop();
        //     if(m.equals(myCopy)){
        //         System.out.println("Copy found in stack 3");
        //     }
        // }
        // while(!st4.isEmpty()){
        //     Object m = st4.pop();
        //     if(m.equals(myCopy)){
        //         System.out.println("Copy found in stack 4");
        //     }
        // }
        // while(!st5.isEmpty()){
        //     Object m = st5.pop();
        //     if(m.equals(myCopy)){
        //         System.out.println("Copy found in stack 5");
        //     }
        // }

        LinkedStack[] stacks = new LinkedStack[5];
        for (int j = 0; j < stacks.length; j++) {
            stacks[j] = new LinkedStack();
            for (int i = 1; i <= 10; i++) {
                stacks[j].push("B" + (i + j * 10));
            }
        }
        Object myCopy = "B17";
        for (int i = 0; i < stacks.length; i++) {
            while (!stacks[i].isEmpty()) {
                Object m = stacks[i].pop();
                if (m.equals(myCopy)) {
                    System.out.println("Copy found in stack " + (i + 1));
                }
            }
        }
    }
}
