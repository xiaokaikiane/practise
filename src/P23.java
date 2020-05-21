import java.util.Scanner;

public class P23 {
    public static void func(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j>=0;j--){
                if(arr[j]<arr[i]){
                    System.out.print(j+" ");
                    break;
                }
                if(j==0) {
                    System.out.print("-1"+" ");
                }
            }
            for(int k=i;k<arr.length;k++){
                if(arr[k]<arr[i]){
                    System.out.print(k);
                    System.out.print("\n");
                    break;
                }
                if(k==arr.length-1){
                    System.out.print("-1");
                    System.out.print("\n");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        func(arr);
    }
}
