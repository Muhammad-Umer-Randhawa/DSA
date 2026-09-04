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
public class MergeLists {
    public static void main(String[] args) {
        Node start1 = new Node(1);
        Node p = start1;
        p.next = new Node(-22);
        p = p.next;
        p.next = new Node(30);
        p = p.next;
        p.next = new Node(4);
        p = p.next;
        p.next = new Node(599);
        p = p.next;

        Node start2 = new Node(-60);
        Node q = start2;
        q.next = new Node(799);
        q = q.next;
        q.next = new Node(-899);
        q = q.next;
        q.next = new Node(9);
        q = q.next;
        q.next = new Node(10);
        q = q.next;

        Node temp = merge(start1, start2);
        for(Node e = temp; e != null; e = e.next){  
            System.out.print(e.val + " ");
        }
    }
    public static Node merge(Node start1, Node start2){
        Node start3 = null;
        for(Node p = start1; p != null; p = p.next){
            start3 = insert(start3, p.val);
        }
        for(Node q = start2; q != null; q = q.next){
            start3 = insert(start3, q.val);
        }
        return start3;
    }
    public static Node insert(Node start, int target){
        if(start == null || start.val > target){
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
        return start;
    }
}