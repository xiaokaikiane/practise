import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        Map<String,Integer> map=new HashMap<>();
        String m = "Invalid";
        for(int i=0;i<number;i++){
            String name=scanner.nextLine();
            map.put(name,0);
        }
        map.put(m,0);
        int number2=scanner.nextInt();
        for (int j = 0; j < number2; j++) {
            String name2 = scanner.nextLine();
            if (!map.containsKey(name2)) {
                map.put(m,map.get(m)+1);
            }else{
                map.put(name2,map.get(name2)+1);
            }
        }
        for(Map.Entry<String,Integer> e:map.entrySet()){
            String c=e.getKey();
            int d=e.getValue();
            System.out.println(c+" : "+d);
        }
    }
}
