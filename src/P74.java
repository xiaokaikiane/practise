import java.util.*;

public class P74 {
    static Set<ArrayList<Integer>> set=new HashSet<>();
    static ArrayList<Integer> list=new ArrayList<>();
    public static int func(int a,int b){
        Func(a,b);
        Iterator<ArrayList<Integer>> iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        return set.size();
    }

    private static void Func(int a, int b) {
        if(a<=0){
            if(list.size()<=b) {
                ArrayList<Integer> ret=new ArrayList<>(list);
                Collections.sort(ret);
                set.add(ret);
            }
            return;
        }
        for (int i=1;i<=a;i++){
           list.add(i);
           Func(a-i,b);
           list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int k=scanner.nextInt();
        System.out.println(func(a,k));
    }
}
