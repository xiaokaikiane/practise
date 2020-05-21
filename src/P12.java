import java.util.List;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public ListNode partition(ListNode pHead, int x) {
        ListNode small=null;
        ListNode big=null;
        ListNode smallast=null;
        ListNode biglast=null;
        for(ListNode cur=pHead;cur!=null;cur=cur.next){
            if (cur.val>=x){
                if (big==null){
                    big=cur;
                }else{
                    biglast.next=cur;
                }
                biglast.next=cur;
            }else{
                if (small==null){
                    small=cur;
                }else{
                    smallast.next=cur;
                }
                smallast.next=cur;
            }
        }
        if(small==null) {
            return big;
        }else {
            smallast.next=big;
            if(biglast!=null) {
                biglast.next=null;
            }
            return small;
        }
    }
}
public class P12{

    public static void main(String[] args) {

    }
}