import java.util.ArrayList;
import java.util.Stack;

public class P70 {
   static class TreeNode {
   int val = 0;
   TreeNode left = null;
   TreeNode right = null;
 }
    public ArrayList<Integer> postOrderFast (TreeNode root) {
       ArrayList<Integer> result=new ArrayList<>();
       if(root==null){
           return result;
       }
        Stack<TreeNode> stack=new Stack<>();
       stack.push(root);
       TreeNode temp=null;
       while(!stack.isEmpty()){
           temp= stack.pop();
           result.add(0,temp.val);
           if (temp.left!=null){
               stack.push(temp.left);
           }
           if (temp.right!=null){
               stack.push(temp.right);
           }
       }
       return result;
    }
}
