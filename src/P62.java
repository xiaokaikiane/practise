import java.util.Scanner;

public class P62 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        System.out.println(func(m,n));
    }

    private static int func(int m, int n) {
        int count=0;
        if (m==0||n==1){
            return 1;
        }
        return  count;
    }
}
