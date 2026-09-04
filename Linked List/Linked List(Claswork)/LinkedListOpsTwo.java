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

public class LinkedListOpsTwo {

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
        return -1;
    }

    /*
    static int get(Node start, int idx) {
        if (idx < 0) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node p = start;
        int count = 0;

        while (p != null) {
            if (count == idx) {
                return p.val;
            }

            p = p.next;
            count++;
        }

        throw new IndexOutOfBoundsException("Index out of range");
    }
    */

    // ---------- Update ----------
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

    /*
    static Node update(Node start, int idx, int newVal) {
        if (idx < 0) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node p = start;
        int count = 0;

        while (p != null) {
            if (count == idx) {
                p.val = newVal;
                return start;
            }

            p = p.next;
            count++;
        }

        throw new IndexOutOfBoundsException(idx + " not found");
    }
    */

    // ---------- Size ----------
    static int size(Node start) {
        int count = 0;
        Node p = start;
        while (p != null) {
            p = p.next;
            count++;
        }
        System.out.println("Size: " + count);
        return count;
    }

    // ---------- Insert (sorted) ----------
    static Node insert(Node start, int target) {
        if (start == null || start.val > target) {
            start = new Node(target, start);
            return start;
        }

        Node p = start;
        while (p.next != null) {
            if (p.next.val > target) break;
            p = p.next;
        }

        p.next = new Node(target, p.next);
        return start;
    }

    // ---------- Insert (unsorted - beginning) ----------
    /*
    static Node insert(Node start, int target) {
        return new Node(target, start);
    }
    */

    // ---------- Insert (unsorted - end) ----------
    /*
    static Node insertEnd(Node start, int target) {
        Node newNode = new Node(target);

        if (start == null) {
            return newNode;
        }

        Node p = start;

        while (p.next != null) {
            p = p.next;
        }

        p.next = newNode;

        return start;
    }
    */

    // ---------- Delete (sorted list) ----------
        // static Node delete(Node start, int x) {
        //     while (start != null && start.val == x) {
        //         start = start.next;
        //     }
        //     if (start == null) return null;

        //     Node p = start;
        //     while (p.next != null) {
        //         if (p.next.val == x) {
        //             p.next = p.next.next;
        //         } else {
        //             p = p.next;
        //         }
        //     }
        //     return start;
        // }

    // ---------- Delete first occurrence (unsorted list) ----------
    /*
    static Node deleteFirst(Node start, int x) {
        if (start == null) {
            return null;
        }

        if (start.val == x) {
            return start.next;
        }

        Node p = start;

        while (p.next != null) {
            if (p.next.val == x) {
                p.next = p.next.next;
                return start;
            }

            p = p.next;
        }

        return start;
    }
    */

    // ---------- Delete all occurrences (unsorted list) ----------
    /*
    static Node deleteAll(Node start, int x) {
        while (start != null && start.val == x) {
            start = start.next;
        }

        if (start == null) {
            return null;
        }

        Node p = start;

        while (p.next != null) {
            if (p.next.val == x) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }

        return start;
    }
    */
   // ---------- Delete by index ----------
    public static Node delete(Node start, int idx) {
        if (idx < 0) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        if (start == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        if (idx == 0) {
            return start.next;
        }
        Node p = start;
        int count = 0;
        while (p.next != null) {
            if (count == idx - 1) {
                p.next = p.next.next;
                break;
            }
            p = p.next;
            count++;
        }
        for(Node e = start; e != null; e = e.next){
            System.out.print(e.val + " ");
        }
        return start;
    }

    // ---------- Reverse ----------
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

    // ---------- Merge sorted lists ----------
    public static Node merge(Node start1, Node start2){

        /*
        Node start3 = null;

        while (start1 != null && start2 != null) {

            if (start1.val <= start2.val) {
                start3 = insert(start3, start1.val);
                start1 = start1.next;
            } 
            else {
                start3 = insert(start3, start2.val);
                start2 = start2.next;
            }
        }

        while (start1 != null) {
            start3 = insert(start3, start1.val);
            start1 = start1.next;
        }

        while (start2 != null) {
            start3 = insert(start3, start2.val);
            start2 = start2.next;
        }

        return start3;
        */

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

    // ---------- Merge unsorted lists ----------
    /*
    public static Node mergeUnsorted(Node start1, Node start2){

        Node start3 = null;

        for(Node p = start1; p != null; p = p.next){
            start3 = insertEnd(start3, p.val);
        }

        for(Node q = start2; q != null; q = q.next){
            start3 = insertEnd(start3, q.val);
        }

        return start3;
    }
    */

    // ---------- Sublist ----------
    // public static Node sublist(Node start, int x, int y){
    //     Node start2 = null;

    //     for(Node p = start; p != null; p = p.next){
    //         if(p.val == x){
    //             start2 = p;
    //         }
    //     }

    //     Node temp = start2;

    //     for(Node q = temp; q != null; q = q.next){
    //         if(q != null && q.val == y){
    //             q.next = null;
    //             break;
    //         }
    //     }

    //     return start2;
    // }

    // ---------- Sublist (new independent list) ----------
    
    public static Node sublistNew(Node start, int x, int y){
        Node start2 = null;
        Node tail = null;
        boolean found = false;
        for(Node p = start; p != null; p = p.next){
            if(p.val == x){
                found = true;
            }
            if(found){
                Node newNode = new Node(p.val);
                if(start2 == null){
                    start2 = newNode;
                    tail = newNode;
                }
                else{
                    tail.next = newNode;
                    tail = newNode;
                }
            }
            if(found && p.val == y){
                break;
            }
        }
        return start2;
    }

    // ---------- Demo ----------
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

        search(start1, -22);
        System.out.println();
        delete(start1, 1);
        System.out.println();
        Node temp = sublistNew(start1, 3, 9);
        for(Node e = temp; e != null; e = e.next){  
            System.out.print(e.val + " ");
        }
    }
}