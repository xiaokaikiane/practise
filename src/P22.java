import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(func(n));
    }

    private static int func(int n) {
        int a=1;
        int b=2;
        int c=4;
        if(n==1){
            return a;
        }
        if(n==2){
            return b;
        }
        if(n==3){
            return c;
        }
        if(n>=4){
            for(int i=4;i<=n;i++){
                int temp=((a+b)+c);
                a=b;
                b=c;
                c=temp;
            }
        }
        return c;
    }
}
