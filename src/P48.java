import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P48 {
    static Map<Integer,Character> map=new TreeMap<>();
    public static void func(int M,int N){
        char[][] arr=new char[M][N];
        char a='A';
        for(int i=0;i<26;i++){
            map.put(i,a);
            a= (char)(a+1);
        }
        int layers = (Math.min(M,N)-1)/2+1;
        int b=0;
        for(int i=0;i<layers;i++){
            for(int k=i;k<N-i;k++){b=b%26;arr[i][k]=map.get(b);b++;}//左至右
            for(int j=i+1;j<M-i;j++){b=b%26;arr[j][N-i-1]=map.get(b);b++;} //右上至右下
            for(int k=N-i-2;(k>=i)&&(M-i-1!=i);k--){b=b%26;arr[M-i-1][k]=map.get(b);b++;} //右至左
            for(int j=M-i-2;(j>i)&&(N-i-1!=i);j--){b=b%26;arr[j][i]=map.get(b);b++;}//左下至左上
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        func(M,N);
    }
}
