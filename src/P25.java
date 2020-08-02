import java.util.*;

//找出字符串只出现一次的字符
public class P25 {
    public  static String func(String s){
        Map<String,Integer> map=new LinkedHashMap<>();
        String[] arr=s.split("");
        for(String c:arr){
            int k=map.getOrDefault(c,0);
            map.put(c,k+1);
        }
        for(String c:map.keySet()){
            if(map.get(c)==1){
                return c;
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String s=scanner.nextLine();
            System.out.println(func(s));
        }
    }
}
