import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class P40 {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static ArrayList<ArrayList<Integer>> printNode (TreeNode node) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(node==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer> temp=new ArrayList<>();
            while(0<size--){
                    TreeNode n = queue.poll();
                    if (n != null) {
                        temp.add(n.val);
                        queue.add(n.left);
                        queue.add(n.right);
                    }
            }
            if(!temp.isEmpty()){
                result.add(temp);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(2);
        TreeNode n1=new TreeNode(3);
        TreeNode n2=new TreeNode(4);
        TreeNode n3=new TreeNode(5);
        TreeNode n4=new TreeNode(6);
        TreeNode n5=new TreeNode(7);
        TreeNode n6=new TreeNode(8);
        root.left=n1;
        root.right=n2;
        n1.left=n3;
        n1.right=n4;
        n2.left=n5;
        n2.right=n6;
        System.out.println(printNode(root));
    }
}
