// class Node{
//     int val;
//     Node next;//default = null
//     Node(int val){
//         this.val = val;
//     }
// }
// public class DisplayList{
//     public static void display(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.val + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static void displayRecursively(Node head){
//         if(head == null) return;
//             System.out.print(head.val+" ");
//             displayRecursively(head.next);
//     }

//     public static int get(Node head, int idx){
//         Node temp = head;
//         for(int i=1;i<=idx; i++){
//             temp = temp.next;
//         }
//         return temp.val;
//     }
//     public static void main(String[] args) {
//         Node a = new Node(10);
//         Node b = new Node(20);
//         Node c = new Node(30);
//         Node d = new Node(40);
//         Node e = new Node(50);
//         // Connecting(linking)
//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;
//         // display(a);
//         // displayRecursively(a);
//         System.out.println(get(a, 3));
//     }
// }