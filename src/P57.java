import java.util.Scanner;

public class P57 {
    public static int  func(int m, int n) {
        if(n>m){
            return 0;
        }
        if(n==0){
            return 1;
        }
       return func(m-1,n-1)+func(m-1,n);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int n=scanner.nextInt();
        System.out.println(func(m,n));

    }
}
