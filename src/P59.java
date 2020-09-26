import java.util.ArrayList;
import java.util.Scanner;

public class P59 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lengthA=scanner.nextInt();
        int lengthB=scanner.nextInt();
        ArrayList<Integer> list1=new ArrayList<>();
         for(int i=0;i<lengthA;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            for (int j=0;j<y;j++){
                list1.add(x);
            }
        }
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<lengthB;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            for(int j=0;j<y;j++){
                list2.add(x);
            }
        }
        System.out.println(func(list1,list2));
    }

    private static int func(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size()==0||list2.size()==0||list1.isEmpty()||list2.isEmpty()){
            return 0;
        }
        int count=0;
        for (int i=0;i<list1.size();i++){
            for (int j=0;j<list2.size();j++){
                if(list1.get(i)>list2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }
}
