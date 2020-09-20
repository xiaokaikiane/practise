
import java.util.Scanner;

public class P49 {
    public static int count=0;
    public  static  int Func(char[][] arr,int N,int M,int P,int Q,String s){
        boolean[][] book=new boolean[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(arr[i][j]=='S'){
                    begin(arr,N,M,P,Q,s,i,j,i,j,-1);
                    break;
                }
            }
        }
        return count;
    }

    private static void begin(char[][] arr, int n,
                              int m, int p, int q,String s,int i,int j,
                              int oi,int oj,int index) {
        if(i<0||i>=n||j<0||j>=m||arr[i][j]=='#'){
            i=oi;
            j=oj;
        }
        if(arr[i][j]=='O'){
            count+=p;
        }else if(arr[i][j]=='X'){
            count-=q;
            arr[i][j]='+';
        }else if( arr[i][j]=='+'||arr[i][j]=='S'){
           count+=0;
        }
        index++;
        if (index<s.length()) {
            if (s.charAt(index) == 'W') {
                oi=i;
                oj=j;
                begin(arr, n, m, p, q, s, i - 1, j,oi,oj, index);
            } else if (s.charAt(index) == 'A') {
                oi=i;
                oj=j;
                begin(arr, n, m, p, q, s, i, j - 1,oi,oj, index);
            } else if (s.charAt(index) == 'D') {
                oi=i;
                oj=j;
                begin(arr, n, m, p, q, s, i, j + 1,oi,oj, index);
            } else if (s.charAt(index) == 'S') {
                oi=i;
                oj=j;
                begin(arr, n, m, p, q, s, i + 1, j,oi,oj, index);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();//行
        int M=sc.nextInt();//列
        int P=sc.nextInt();//得分
        int Q=sc.nextInt();//失分
        sc.nextLine();
        String[] arr=new  String[N];
       for(int i=0;i<N;i++){
           arr[i]=sc.nextLine();
       }
       char[][] ret=new char[N][M];
       for (int i=0;i<N;i++){
           ret[i]=arr[i].toCharArray();
       }
        for (int i=0;i<N;i++){
            for (int j=0;j<M;j++){
                System.out.print(ret[i][j]);
            }
            System.out.print("\n");
        }
        String s=sc.nextLine();
        System.out.println(Func(ret,N,M,P,Q,s));
    }
}
