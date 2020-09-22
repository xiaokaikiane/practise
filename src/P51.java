import java.util.ArrayList;
import java.util.Scanner;

public class P51 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int  val){
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
    public static void Merge(ListNode list1, ListNode list2) {
        String s="";
        if (list1 == null) {
            ListNode cur=list2;
            while(cur!=null){
                s+=(String.valueOf(cur.val));
                s+=",";
                cur=cur.next;
            }
            System.out.println(s.substring(0,s.length()-1));
            return;
        }
        if (list2 == null) {
            ListNode cur=list1;
            while(cur!=null){
                s+=(String.valueOf(cur.val));
                s+=",";
                cur=cur.next;
            }
            System.out.println(s.substring(0,s.length()-1));
            return;
        }
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode NewNode = null;
        ListNode point = null;
        while (cur1 != null && cur2 != null) {

            if (cur1.val <= cur2.val) {
                ListNode next = cur1.next;
                if (NewNode == null) {
                    NewNode = cur1;
                } else {
                    cur1.next = null;
                    point.next = cur1;
                }
                point = cur1;
                cur1 = next;
            } else {
                ListNode next = cur2.next;
                if (NewNode == null) {
                    NewNode = cur2;
                } else {
                    cur2.next = null;
                    point.next = cur2;
                }
                point = cur2;
                cur2 = next;
            }
        }
        if (cur1 == null) {
            point.next = cur2;
        }
        if (cur2 == null) {
            point.next = cur1;
        }
        ListNode cur=NewNode;
        while(cur!=null){
            s+=(String.valueOf(cur.val));
            s+=",";
            cur=cur.next;
        }
        System.out.println(s.substring(0,s.length()-1));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        StringBuilder stringBuilder=new StringBuilder(s);
        int a=stringBuilder.indexOf("|");
        String s1=stringBuilder.substring(0,a);
        String s2=stringBuilder.substring(a+1,stringBuilder.length());
        String[] arr1=s1.split(",");
        String[] arr2=s2.split(",");
        ArrayList<ListNode> list1=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            list1.add(new ListNode(Integer.parseInt(arr1[i])));
        }
        for(int i=0;i<list1.size()-1;i++){
            list1.get(i).next=list1.get(i+1);
        }
        ArrayList<ListNode> list2=new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            list2.add(new ListNode(Integer.parseInt(arr2[i])));
        }
        for(int i=0;i<list2.size()-1;i++){
            list2.get(i).next=list2.get(i+1);
        }
        Merge(list1.get(0),list2.get(0));
    }
}
