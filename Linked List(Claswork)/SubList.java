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
    public class SubList {
        public static void main(String[] args) {
            // Node start1 = new Node(1);
            // Node p = start1;
            // p.next = new Node(2);
            // p = p.next;
            // p.next = new Node(3);
            // p = p.next;
            // p.next = new Node(4);
            // p = p.next;
            // p.next = new Node(5);
            // p = p.next;
            // p.next = new Node(6);
            // p = p.next;
            // p.next = new Node(7);
            // p = p.next;
            // p.next = new Node(8);
            // p = p.next;
            // p.next = new Node(9);
            // p = p.next;
            // p.next = new Node(10);
            // p = p.next;
            // p.next = new Node(11);
            // p = p.next;
            // p.next = new Node(12);
            // p = p.next;
            // p.next = new Node(13);
            // p = p.next;
            // p.next = new Node(14);
            // p = p.next;
            // p.next = new Node(15);
            // p = p.next;

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

            Node temp = sublist(start1, 3, 9);
            for(Node e = temp; e != null; e = e.next){  
                System.out.print(e.val + " ");
            }
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
