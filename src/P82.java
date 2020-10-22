import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P82 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<Integer, String> map=new TreeMap<>();
        int x=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<x;i++){
            String s=scanner.nextLine();
            String[] arr=s.split(",");
            map.put(Integer.parseInt(arr[1]),arr[0]);
        }
        for(Integer e:map.keySet()){
            System.out.print(map.get(e)+","+e);
        }

    }
}
