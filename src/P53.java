import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class P53 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String t=scanner.nextLine();
        int count=0;
        StringBuilder stringBuilder=new StringBuilder(s);
        for (int i=0;i<t.length();i++){
            if (stringBuilder.length()==0){
                break;
            }
            if (s.contains(t.substring(i,i+1))){
                int a=stringBuilder.indexOf(String.valueOf(t.charAt(i)));
                stringBuilder.deleteCharAt(a);
                s=stringBuilder.toString();
                count++;
            }
        }
        System.out.println(count);
    }
}
