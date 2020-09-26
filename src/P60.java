import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P60 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        func(s);
    }

    private static void func(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (int i=0;i<s.length();i++){
            int k=map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i),k+1);
        }
        String s1="";
        for (Character c:map.keySet()){
            if (map.get(c)==1){
                s1+=c;
            }
        }
        System.out.println(s1);
    }
}
