import java.util.ArrayList;
import java.util.Scanner;

public class P78 {
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
    private static int func(int n, int m, ArrayList<ListNode> result) {
        int sum=0;
        for(int i=0;i<m;i++){
            sum+=Func(n,result.get(i));
        }
        return sum;
    }

    private static int Func(int n, ListNode listNode) {
        int length=0;
        int point=0;
        ListNode cur=listNode;
        while(cur!=null){
            length++;
            cur=cur.next;
        }
        if(n<0||n>length){
            return 0;
        }
        ListNode cur1=listNode;
        for(int i=0;i<length-n;i++){
            cur1=cur1.next;
        }
        return cur1.val;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//取出元素的位置
        int m=scanner.nextInt();//取出元素的行数
        scanner.nextLine();
        ArrayList<ListNode> result=new ArrayList<>();
        int M=m;
        while(0<M--){
            String s=scanner.nextLine();
            ArrayList<ListNode> list=new ArrayList<>();
            String[] arr=s.split(",");
            for(int i=0;i<arr.length;i++){
                ListNode cur=new ListNode(Integer.parseInt(arr[i]));
                list.add(cur);
            }
            for(int i=0;i<list.size()-1;i++){
                list.get(i).next=list.get(i+1);
            }
            result.add(list.get(0));
        }
        System.out.println(func(n,m,result));
    }
}
