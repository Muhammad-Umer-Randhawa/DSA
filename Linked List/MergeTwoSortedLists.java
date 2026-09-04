public class MergeTwoSortedLists {
    // public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    //     ListNode t1 = list1;
    //     ListNode t2 = list2;
    //     ListNode d = new ListNode(-1);
    //     ListNode t = d;
    //     while(t1 != null && t2 != null){
    //         if(t1.val <= t2.val){
    //             t.next = t1;
    //             t1 = t1.next;
    //         }
    //         else{
    //             t.next = t2;
    //             t2 = t2.next;
    //         }
    //         t = t.next;
    //     }
    //     if(t1 == null) t.next = t2;
    //     else t.next = t1;
    //     return d.next;
    // }
}
