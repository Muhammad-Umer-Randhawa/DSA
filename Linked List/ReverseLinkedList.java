public class ReverseLinkedList {
    // public ListNode reverseList(ListNode head) {
    //brute force approach
    // if (head == null || head.next == null) {
    //     return head;
    // }
    // ListNode temp = head;
    // ArrayList<ListNode> arr = new ArrayList<>();
    // while(temp != null){
    //     arr.add(temp);
    //     temp = temp.next;
    // }
    // int n = arr.size();
    // for(int i=n-1; i>=1; i--){
    //     arr.get(i).next = arr.get(i-1);
    // }
    // arr.get(0).next = null;
    // return arr.get(n-1);

//     Better approach
//     ListNode c = head;
//     ListNode p = null;
//     ListNode f = null;
//     while(c != null){
//         f = c.next;
//         c.next = p;
//         p = c; 
//         c = f;
//     }
//     return p;
// }
}

