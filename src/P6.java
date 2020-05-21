import java.util.Scanner;

public class P6 {
    public static int func(int a,int b){
        if(a<b){
            int n=a;
            a=b;
            b=n;
        }
            while(b!=0) {
                int j = a % b;
                a = b;
                b = j;
            }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int m=func(a,b);
        System.out.println((a*b)/m);
    }
}
