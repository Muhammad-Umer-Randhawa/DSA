class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
public class TraverseLinkedList {
    public static void main(String[] args) {
        Node start = new Node(1);
        Node p = start;
        p.next = new Node(7);
        p = p.next;
        p.next = new Node(3);
        p = p.next;
        p.next = new Node(12);
        p = p.next;
        p.next = new Node(5);
        p = p.next;
        p.next = new Node(9);
        p = p.next;
        p.next = new Node(2);
        p = p.next;

        traverse(start);
    }
    public static void traverse(Node start){
        if(start == null) return;
        System.out.print(start.val + " ");
        traverse(start.next);
    }
}
