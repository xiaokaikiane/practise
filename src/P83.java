public class P83 {
    public class TreeNode {
   int val = 0;
    TreeNode left = null;
    TreeNode right = null;
  }
    public TreeNode nearestCommonAncestor (TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||p==root||q==root){
            return root;
        }
        TreeNode left=nearestCommonAncestor(root.left,p,q);
        TreeNode right=nearestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null){
            return root;
        }else if(left==null){
            return right;
        }else if(right==null){
            return left;
        }else{
            return null;
        }
    }
}
