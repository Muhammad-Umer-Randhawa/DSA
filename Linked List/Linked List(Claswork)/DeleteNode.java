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
}
public class DeleteNode {
    public static void main(String[] args) {
        Node start1 = new Node(10);
        Node p = start1;
        p.next = new Node(2);
        p = p.next;
        p.next = new Node(390);
        p = p.next;
        p.next = new Node(41234);
        p = p.next;
        p.next = new Node(-5);
        p = p.next;

        Node temp = delete(start1, 10);
        for(Node e = temp; e != null; e = e.next){  
            System.out.print(e.val + " ");
        }
    }
    public static Node delete(Node start, int x){
        if(start == null || start.val > x){
            return start;
        }
        if(start.val == x){
            return start.next;
        }
        for(Node p = start; p != null && p.next != null; p = p.next){
            if(p.next.val == x){
                p.next = p.next.next;
                break;
            }
        }
        return start;
    }
}

