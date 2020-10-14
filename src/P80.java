import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P80 {
    public static String func(String s){
        Map<String,Integer> map=new HashMap<>();
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                int k=map.getOrDefault(s.substring(i,j),0);
                map.put(s.substring(i,j),k+1);
            }
        }
        ArrayList<String> list=new ArrayList<>();
        for (String x:map.keySet()){
            if (map.get(x)>=2){
                list.add(x);
            }
        }
        int max=0;
        for (int i=1;i<list.size();i++){
            if (list.get(i).length()>list.get(max).length()){
                max=i;
            }
        }
        return list.get(max);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(func(s));
    }
}
