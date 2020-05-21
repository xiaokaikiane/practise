import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P4 {
    public static void func(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            int n=map.getOrDefault(a,0);
            map.put(a,n+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int b=e.getKey();
            int c=e.getValue();
            if(c>=(arr.length)/2){
                System.out.println(b);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入:");
        String A=scanner.next();
        String[] arr=A.split(" ");
        int[] a=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            a[i]=Integer.parseInt(arr[i]);
        }
        func(a);
    }
}
