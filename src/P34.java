
import java.util.Scanner;

public class P34 {
    static class TreeNode{
        char x;
        TreeNode left;
        TreeNode right;
        TreeNode(char x){
            this.x=x;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "x=" + x +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
    public static TreeNode Func(String a,String b){
        if(b.length()==0){
            return null;
        }
        char rootval=b.charAt(b.length()-1);
        if(b.length()==1){
            return new TreeNode(rootval);
        }
        int i=0;
        for(;i<a.length();i++){
            if(a.charAt(i)==rootval) {
                break;
            }
        }
        TreeNode root=new TreeNode(rootval);
        root.left=Func(a.substring(0,i),b.substring(0,i));
        root.right=Func(a.substring(i+1,a.length()-1),b.substring(i,b.length()-1));
        return root;
    }
    public static  void func1(TreeNode root){
        if (root==null){
            return ;
        }
        System.out.print(root.x);
        func1(root.left);
        func1(root.right);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()) {
            String a = scanner.nextLine();
            String[] arr=a.split(" ");
            TreeNode root = Func(arr[0],arr[1]);
            System.out.println(root);
            func1(root);
        }
    }
}
