import java.util.Scanner;

public class P5 {
    public static int fib(int k){
        if(k<=2){
            return 1;
        }
        return fib(k-1)+fib(k-2);
    }
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        System.out.println("请输入一个数:");
        int n=scanner.nextInt();
        int N=n;
        int count1=0;
        int count2=0;
        int z=0;
        if(n>=0) {
            while (true) {
                for (int i = 1; i < n; i++) {
                    z = fib(i);
                    if(n>z){
                        continue;
                    }
                    if (n == z) {
                        break;
                    }
                    n++;
                    count1++;
                }
                break;
            }
        }else{
            System.out.println("错误");
        }
        if(N>=0){
            while (true) {
               for(int j=N;j>0;j--){
                   z=fib(j);
                   if(N<z){
                       continue;
                   }
                   if(N==z){
                       break;
                   }
                   N--;
                   count2++;
               }
               break;
            }
        }else{
            System.out.println("错误");
        }
        if(count1<count2){
            System.out.println(count1);
        }else{
            System.out.println(count2);
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}
