import java.util.Arrays;
import java.util.Scanner;

public class P46 {
    public static int func(String[] ret){
        if (ret.length==0){
            return 0;
        }
        int[] arr=new int[ret.length];
        for (int i=0;i<ret.length;i++){
            arr[i]=Integer.parseInt(ret[i]);
        }
        System.out.println(Arrays.toString(arr));
        int max=arr[0];
        int cur=arr[0];
        for (int i=1;i<arr.length;i++){
            cur=Math.max(arr[i],cur+arr[i]);
            if (cur>max){
                max=cur;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  s=sc.nextLine();
        StringBuilder sb =new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        String[] arr=sb.toString().split(",");
        System.out.println(func(arr));
    }
}
