class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
    Node(int data, Node next){
        this.val = data;
        this.next = next;
    }
    static Node insert(Node start, int target){
        if(start == null || start.val > target){ // when need insert at front
            start = new Node(target, start);
            return start;
        }
        Node p = start;
        while(p.next != null){
            if(p.next.val > target){
                break;
            }
            p = p.next; // else
        }
        p.next = new Node(target, p.next);
        System.out.print("Inserted " + target + " after " + p.val + "\n");
        for(Node e = start; e != null; e = e.next){
            System.out.print(e.val + " ");
        }
        return start;
    }
}
public class Insert {
    public static void main(String[] args) {
        Node start = new Node(40);
        start = Node.insert(start, 5);
        start = Node.insert(start, 10);
        start = Node.insert(start, 3);
        start = Node.insert(start, 7);
        start = Node.insert(start, 1);
    }
}

