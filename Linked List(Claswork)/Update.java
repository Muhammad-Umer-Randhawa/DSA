public class Update {
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

        Node temp = update(start1, 9, 4);
        for(Node e = temp; e != null; e = e.next){  
            System.out.print(e.val + " ");
        }
    }
    public static Node update(Node start, int idx, int newVal){
        if(start == null){
            throw new NullPointerException("Start is null");
        }
        int count = 0;
        Node p = start;
        boolean found = false;
        while(p!=null){
            if(count == idx){
                p.val = newVal;
                found = true;
                break;
            }
            p = p.next;
            count++;
        }
        if(!found) {
            throw new IndexOutOfBoundsException(idx + " not found");
        }
        return start;
    }
}
