import java.util.Scanner;

public class P7{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=1;
        int N=n;
        if(N>=0&&N%1==0) {
            for (int i = 0; i < N; i++) {
                k = k * n;
                n = n - 1;
            }
        }
        String s=String.valueOf(k);
        char[] S=s.toCharArray();
        for(int j=0;j<(S.length)/2;j++){
            char a=S[j];
            S[j]=S[S.length-1-j];
            S[S.length-1-j]=a;
        }
        int count=0;
        for(int z=0;z<S.length;z++){
            if (S[z]=='0') {
                count++;
            }
            if (S[z]!='0'){
                break;
            }
        }
        System.out.println(count);
    }
}

