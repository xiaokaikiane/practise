import java.util.Scanner;

public class P65 {

    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String [] chars=s.split(",");
        int m=Integer.parseInt(chars[0]);
        int n=Integer.parseInt(chars[1]);
        int[][] arr=new int[m][n];
         for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println(func(arr,m,n));
    }
    public  static int func(int[][] arr,int m,int n) {
        int[][] ret=new int[m+1][n+1];
        for (int i=0;i<=m;i++){
            for (int j=0;j<=n;j++){
                if (i==0||j==0){
                    ret[i][j]=0;
                    continue;
                }
                ret[i][j]=Math.max(ret[i-1][j],ret[i][j-1])+arr[i-1][j-1];
            }
        }
        return ret[m][n];
    }
}
