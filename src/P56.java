import java.util.ArrayList;
import java.util.Scanner;

public class P56 {
    public static int sort (String inData) {
        if (inData.equals(" ")){
            return 0;
        }
        System.out.println(inData);
        StringBuilder stringBuilder=new StringBuilder(inData);
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        inData=stringBuilder.toString();
        String[] arr=inData.split(" ");
        System.out.println(inData);
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            list.add(Integer.parseInt(arr[i]));
        }
        System.out.println(list);
        int count=0;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<list.get(i+1)){
                continue;
            }
            int a=list.remove(i);
            count++;
            list.add(a);
            i=0;
        }
        System.out.println(list);
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(sort(s));
    }
}
