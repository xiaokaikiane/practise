import java.util.Scanner;

public class P16 {
    public static int Max(int[] arr,int a,int b){
        if(a>b){
            int t=a;
            b=a;
            a=t;
        }
        int max=0;
        for(int i=a-1;i<b;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()) {
       int N=scanner.nextInt();
       int M=scanner.nextInt();
       int[] arr=new int[N];
       for(int i=0;i<N;i++){
          arr[i]=scanner.nextInt();
       }
               String A = scanner.next();
               int a = scanner.nextInt();
               int b = scanner.nextInt();
               if (A.equals("Q")) {
                   System.out.println(Max(arr, a, b));
               }
               if (A.equals("U")) {
                   System.out.println(arr[a - 1] = b);
               }
       }
    }
}
