
import java.util.Scanner;

public class P67 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        StringBuilder stringBuilder=new StringBuilder(s);
        int left=0;
        int right=0;
       for (int i=0;i<stringBuilder.length();i++){
           if (stringBuilder.charAt(i)=='_'){
               stringBuilder.replace(i,i+1," ");
           }
       }
       s=stringBuilder.toString().trim();
        System.out.println(s);
       StringBuilder sb=new StringBuilder(s);
       for (int i=0;i<sb.length();i++){
           if (sb.charAt(i)==' '){
               sb.replace(i,i+1,"_");
           }
       }
        System.out.println(sb.toString());
       for (int i=0;i<sb.length()-1;i++){
           if (sb.charAt(i)=='_'&&sb.charAt(i+1)=='_'){
               sb.deleteCharAt(i+1);
               i--;
           }
       }
        System.out.println(sb.toString());
    }
}
