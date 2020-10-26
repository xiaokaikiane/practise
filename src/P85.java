import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P85{
        public static String  strToBytes (String uuid) {
            StringBuilder stringBuilder=new StringBuilder(uuid);
            ArrayList<String> list=new ArrayList<>();
            for(int i=0;i<stringBuilder.length();) {
                if (stringBuilder.charAt(i) == '-') {
                    String ss = stringBuilder.substring(i, i + 3);
                    stringBuilder.delete(i, i + 3);
                    i=0;
                    list.add(ss);
                } else {
                    String ss = stringBuilder.substring(i, i + 2);
                    stringBuilder.delete(i, i + 2);
                    i=0;
                    list.add(ss);
                }
            }
            int[] arr=new int[list.size()];
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
                StringBuilder sb=new StringBuilder(list.get(i));
                if(sb.charAt(0)=='0'){
                    sb.deleteCharAt(0);
                }
                String x=sb.toString();
                arr[i]=Integer.parseInt(x,16);
            }
            System.out.println(Arrays.toString(arr));
            return Arrays.toString(arr);
        }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        strToBytes(s);
    }
}
