public class P69 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    static boolean hasPathSum(TreeNode root,int target){

        if (root==null){
            return false;
        }
        target-=root.val;
        if(root.left==null&&root.right==null){
            if (target==0){
                return true;
            }else{
                return false;
            }
        }
       boolean left=hasPathSum(root.left,target);
        boolean right=hasPathSum(root.right,target);
        target+=root.val;
        return left||right;
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
        System.out.println(hasPathSum(root,15));
    }
}
