import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P26 {
    public static int func(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            int k=map.getOrDefault(a,0);
            map.put(a,k+1);
        }
        for(int a:map.keySet()){
            if(map.get(a)>(arr.length/2)){
                return a;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(func(arr));
    }
}
