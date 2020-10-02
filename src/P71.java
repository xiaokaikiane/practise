public class P71 {
    static class ListNode {
     int val;
    ListNode next;
     ListNode(int x) {
        val = x;
          next = null;
     }
 }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode p=head;
        ListNode q=head.next;
        while(q!=null){
            ListNode temp=q.next;
            if(p.val!=q.val){
                p=q;
                q=temp;
            }else{
                p.next=temp;
                q=temp;
            }
        }
        return pre.next;
    }
}
