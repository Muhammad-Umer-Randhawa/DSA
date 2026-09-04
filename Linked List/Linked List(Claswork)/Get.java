public class Get {
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

        int e = get(start1, 6);
        System.out.println(e);
    }
    public static int get(Node start, int idx){
        if(start == null){
            throw new NullPointerException("Null value");
        }
        if(idx == 0){
            return start.val;
        }
        int count = 0;
        Node p = start;
        while(p!=null){
            if(count == idx){
                return p.val;
            }
            p = p.next;
            count++;
        }
        return -1;
    }
}

