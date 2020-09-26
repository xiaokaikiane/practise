import java.util.Scanner;

public class P58 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        scanner.nextLine();
        String A=scanner.nextLine();
        String B=scanner.nextLine();
        String a="";
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)!=' '){
                a+=A.charAt(i);
            }
        }
        String b="";
        for(int i=0;i<B.length();i++){
            if(B.charAt(i)!=' '){
                b+=B.charAt(i);
            }
        }
        System.out.println(func(a,b));
    }

    public static int func(String a, String b) {
        int m=a.length();
        int n=b.length();
        System.out.println(m);
        System.out.println(n);
        int[][] arr=new int[m+1][n+1];
        for (int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0&&j==0){
                    arr[i][j]=1;
                    continue;
                }
                if(i==0){
                    arr[i][j]=0;
                    continue;
                }
                if(j==0){
                    arr[i][j]=1;
                    continue;
                }//f(i,j)=f(i-1)(j-1)+f(i-1)(j)
                if(a.charAt(i-1)==b.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }else{//f(i,j)=f(i-1)(j)
                    arr[i][j]=arr[i-1][j];
                }
            }
        }
        return arr[m][n];
    }
}
