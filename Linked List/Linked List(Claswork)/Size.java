public class Size {
    public static void main(String[] args) {
        Node start1 = new Node(1);
        Node p = start1;
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

        int size = size(start1);
        System.out.println(size);
    }
    public static int size(Node start){
        int count = 0;
        Node p = start;
        while(p!=null){
           p = p.next;
           count++; 
        }
        return count;
    }
}
