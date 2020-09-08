import java.util.Scanner;

public class P28 {
    public static boolean func(char[][] arr, String s) {
        if (s.length() == 0 || s == null) {
            return false;
        }
        int row = arr.length;
        int col = arr[0].length;
        int[][] book = new int[row][col];
        boolean l=false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j]==s.charAt(0)){
                     l=func2(arr,s,row,col,i,j,book,0);
                     if(l){
                         return l;
                     }
                }
            }
        }
        return l;
    }
    private static int[][] point={{0,1},{1,0},{0,-1},{-1,0}};
    private static boolean func2(char[][] arr, String s, int row, int col,
                              int i, int j,int[][] book,int a) {
        book[i][j]=1;
        if(a+1==s.length()){
            return true;
        }
        a+=1;
        for(int k=0;k<4;k++){
            int newi=i+point[k][0];
            int newj=j+point[k][1];
            if(newi<0||newi>=row||newj<0||newj>=col||book[newi][newj]==1){
                continue;
            }
           if(arr[newi][newj]==s.charAt(a)){
               func2(arr,s,row,col,newi,newj,book,a);
           }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] chars = {
                {'A', 'B', 'C', 'E'},

                {'S', 'F', 'C', 'S'},

                {'A', 'D', 'E', 'E'}};

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(func(chars,str));
    }
}
