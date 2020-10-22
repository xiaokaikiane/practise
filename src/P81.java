import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P81 {
    //数组循环右移 将一个长度为n的数组A的元素循环右移k位,
   // 比如 数组 1, 2, 3, 4, 5 循环右移3位之后变成 3, 4, 5, 1, 2
    public static void func(int[] arr,int n){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<n;i++){
            int k=list.remove(list.size()-1);
            list.add(0,k);
        }
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        int n=scanner.nextInt();
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=scanner.nextInt();
        }
        func(arr,n);
    }
}
