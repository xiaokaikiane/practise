import java.util.HashMap;
import java.util.Map;

public class P14 {
    public int getValue(int[] gifts, int n) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:gifts){
            int k=map.getOrDefault(a,0);
            map.put(a,k+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int b=e.getKey();
            int c=e.getValue();
            if(c>(n)/2){
                return b;
            }
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
