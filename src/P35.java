

public class P35 {
     static class ListNode{
         int val;
         ListNode next;
         ListNode(int val){
             this.val=val;
         }

         @Override
         public String toString() {
             return "ListNode{" +
                     "val=" + val +
                     ", next=" + next +
                     '}';
         }
     }
     public static ListNode func(ListNode head) {
         if (head==null||head.next==null){
             return head;
         }
         ListNode pre=head;
         ListNode cur=head.next;
         ListNode Nhead=new ListNode(0);
         Nhead.next=head;
         while(cur!=null){
             if(cur.val<pre.val){
                 pre.next=cur.next;
                 ListNode node=Nhead;
                 ListNode node1=Nhead.next;
                 while(cur.val>node1.val){
                     node=node1;
                     node1=node1.next;
                 }
                 node.next=cur;
                 cur.next=node1;
                 cur=pre.next;
             }else{
                 pre=cur;
                 cur=cur.next;
             }
         }
         return  Nhead.next;
     }

    public static void main(String[] args) {
        ListNode n1=new ListNode(4);
        ListNode n2=new ListNode(1);
        ListNode n3=new ListNode(2);
        ListNode n4=new ListNode(5);
        ListNode n5=new ListNode(8);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        System.out.println(func(n1));
    }
}
