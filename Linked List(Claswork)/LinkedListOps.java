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

public class LinkedListOps {

    // ---------- Traverse ----------
    static void traverse(Node start) {
        Node p = start;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    // ---------- Search ----------
    // Returns true if x exists in the list.
    static boolean search(Node start, int x) {
        if (start == null) {
            System.out.println("The list is empty");
            return false;
        }
        Node p = start;
        while (p != null) {
            if (p.val == x){
                System.out.println(x + " exists in the linked list"); 
                return true;
            }
            p = p.next;
        }
        System.out.println(x + " does not exist in the linked list");
        return false;
    }

    // ---------- Get ----------
    // Returns value at index idx (0-based). Throws if list is empty or idx out of range.
    static int get(Node start, int idx) {
        if (start == null) {
            throw new NullPointerException("Start is null");
        }
        if (idx == 0) {
            return start.val;
        }
        int count = 0;
        Node p = start;
        while (p != null) {
            if (count == idx) {
                return p.val;
            }
            p = p.next;
            count++;
        }
        return -1; // idx out of range
    }

    // ---------- Update ----------
    // Sets value at index idx to newVal. Throws if idx not found.
    static Node update(Node start, int idx, int newVal) {
        if (start == null) {
            throw new NullPointerException("Start is null");
        }
        int count = 0;
        Node p = start;
        boolean found = false;
        while (p != null) {
            if (count == idx) {
                p.val = newVal;
                found = true;
                break;
            }
            p = p.next;
            count++;
        }
        if (!found) {
            throw new IndexOutOfBoundsException(idx + " not found");
        }
        return start;
    }

    // ---------- Size ----------
    static int size(Node start) {
        int count = 0;
        Node p = start;
        while (p != null) {
            p = p.next;
            count++;
        }
        return count;
    }

    // ---------- Insert (sorted) ----------
    // Inserts target into a sorted list, keeping it sorted. Returns new head.
    static Node insert(Node start, int target) {
        // Case A: belongs at the front (empty list, or smaller than current head)
        if (start == null || start.val > target) {
            start = new Node(target, start);
            return start;
        }
        // Case B: belongs somewhere after the front — find predecessor p
        Node p = start;
        while (p.next != null) {
            if (p.next.val > target) break;
            p = p.next;
        }
        p.next = new Node(target, p.next);
        return start;
    }

    // ---------- Delete (by value, sorted list) ----------
    // Removes first occurrence of x. Returns new head.
    static Node delete(Node start, int x) {
        // strip matching nodes from the front first (possibly several in a row)
        while (start != null && start.val == x) {
            start = start.next;
        }
        if (start == null) return null;

        Node p = start;
        while (p.next != null) {
            if (p.next.val == x) {
                p.next = p.next.next; // skip it, don't advance p
            } else {
                p = p.next; // only advance when no deletion happened
            }
        }
        return start;
    }

    public static Node reverse(Node start){
        Node c = start;
        Node p = null;
        Node f = null;
        while(c != null){
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
    }
    public static Node merge(Node start1, Node start2){
        Node start3 = null;
        start3 = insert(start3, start1.val);
        for(Node p = start1.next; p != null; p = p.next){
            start3 = insert(start3, p.val);
        }
        for(Node q = start2; q != null; q = q.next){
            start3 = insert(start3, q.val);
        }
        return start3;
    }
    public static Node sublist(Node start, int x, int y){
        Node start2 = null;
        for(Node p = start; p != null; p = p.next){
            if(p.val == x){
                start2 = p;
            }
        }
        Node temp = start2;
        for(Node q = temp; q != null; q = q.next){
            if(q != null && q.val == y){
                q.next = null;
                break;
            }
        }
        return start2;
    }
    // ---------- Demo ----------
    public static void main(String[] args) {
        // Node start = null;
        // start = insert(start, 5);
        // start = insert(start, 10);
        // start = insert(start, 3);
        // start = insert(start, 7);
        // start = insert(start, 1);
        // traverse(start); // 1 3 5 7 10

        // System.out.println("size = " + size(start));
        // System.out.println("search 7 = " + search(start, 7));
        // System.out.println("get(2) = " + get(start, 2));

        // start = update(start, 2, 99);
        // traverse(start); // 1 3 99 7 10

        // start = delete(start, 99);
        // traverse(start); // 1 3 7 10

        // Node reversedList = reverse(start);
        // for(Node e = reversedList; e != null; e = e.next){
        //     System.out.print(e.val + " ");
        // }
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

        search(start1, -22);
    }
}
